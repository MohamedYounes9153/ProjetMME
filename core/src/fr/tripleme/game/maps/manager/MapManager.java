package fr.tripleme.game.maps.manager;

import fr.tripleme.game.maps.Map;
import fr.tripleme.game.maps.worlds.FirstMap;
import fr.tripleme.game.maps.worlds.MapRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public final class MapManager {
    public static HashMap<String, MapRepository> maps = new HashMap<>(16);
    private static final HashMap<String, Supplier<? extends MapRepository>> mapFactory = new HashMap<>();
    public static Set<Map> activeMaps = new HashSet<>();

    static {
        mapFactory.put("landingMap", FirstMap::new);
    }

    /**
     * Insert a map into the hashmap.
     * @param name Name of the map.
     * @param map Instance of the map.
     */
    public static void insertMap(String name, MapRepository map) {
        maps.put(name, map);
    }

    /**
     * Remove a map from the hashmap.
     * @param name Name of the map.
     */
    public static void removeMap(String name) {
        maps.remove(name);
    }

    /**
     * @param map Map instance.
     */
    public static void addActiveMap(Map map) {
        activeMaps.add(map);
    }

    /**
     */
    public static void purge() {
        activeMaps.clear();
    }

    public static Supplier<? extends MapRepository> getMapFromFactory(String mapName) {
        return mapFactory.get(mapName);
    }
}
