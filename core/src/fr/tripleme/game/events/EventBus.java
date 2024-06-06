package fr.tripleme.game.events;

import fr.tripleme.game.subscribe.EventListenable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

public class EventBus {
    private static EventBus instance = null;
    private final HashMap<Class<? extends Event>, HashSet<Method>> eventListener = new HashMap<>();
    private final HashMap<Method, Class<? extends EventListenable>> listeners = new HashMap<>();

    private EventBus() {
    }

    /**
     * Singleton
     * @return EventBus
     */
    public static EventBus getInstance() {
        if (instance == null) {
            instance = new EventBus();
        }
        return instance;
    }

    /**
     * @param object
     */
    public void register(Class<? extends EventListenable> object) {
        Method[] methods = object.getDeclaredMethods();
        // We get our subscribe event
        for (Method method : methods) {
            SubscribeEvent event = method.getAnnotation(SubscribeEvent.class);
            // Check if he exists
            if (event == null) {
                throw new IllegalArgumentException("The given object does not have a SubscribeEvent");
            }
            // We get our event type
            Class <? extends Event> eventType = event.event();
            if (eventType == null) {
                throw new IllegalArgumentException("There's no paramater in this method!");
            }

            if (!Event.class.isAssignableFrom(eventType)) {
                throw new IllegalArgumentException("The class does not extend from event in this method!");
            }

            // We are now sure that the event type actually extends from Event.
            this.setEventListener(eventType, method);
            this.listeners.put(method, object);
        }
    }

    /**
     * Event bus caller for the event.
     * @param event
     */
    public void call(Event event) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        Class<? extends Event> eventClass = event.getClass();
        HashSet<Method> methods = this.eventListener.get(eventClass);
        if (methods == null) {
            return;
        }
        for (Method method : methods) {
            Class<? extends EventListenable> object = this.listeners.get(method);
            method.invoke(object.getDeclaredConstructor().newInstance(), event);
        }
    }

    /**
     *
     * @return HashMap<Class<Event>, Set<Method>>
     */
    public HashMap<Class<? extends Event>, HashSet<Method>> getEventListener() {
        return eventListener;
    }

    /**
     *
     * @param eventType
     * @param method
     */
    public void setEventListener(Class<? extends Event> eventType, Method method) {
        HashSet<Method> set = this.eventListener.get(eventType);
        if (set == null) {
            set = new HashSet<>(16);
        }
        set.add(method);
        eventListener.put(eventType, set);
    }
}
