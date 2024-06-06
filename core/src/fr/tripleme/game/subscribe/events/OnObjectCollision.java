package fr.tripleme.game.subscribe.events;

import fr.tripleme.game.events.Event;
import fr.tripleme.game.events.SubscribeEvent;
import fr.tripleme.game.events.collisions.CollisionEvent;
import fr.tripleme.game.subscribe.EventListenable;

public class OnObjectCollision implements EventListenable {
    /**
     * @param event
     */
    @SubscribeEvent(event = CollisionEvent.class)
    public void onCollision(Event event) {
        CollisionEvent ce = (CollisionEvent) event;
        System.out.println("Une collision a eu lieu et voici l'objet " + ce.getCollisionObject());
    }
}
