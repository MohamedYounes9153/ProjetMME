package fr.tripleme.game.parsing.configs;

import com.badlogic.gdx.utils.JsonValue;
import fr.tripleme.game.maps.Map;
import fr.tripleme.game.maps.manager.MapManager;
import fr.tripleme.game.maps.structure.MapStructure;
import fr.tripleme.game.maps.worlds.FirstMap;
import fr.tripleme.game.maps.worlds.MapBase;
import fr.tripleme.game.maps.worlds.MapRepository;
import fr.tripleme.game.parsing.Parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Supplier;


public class MapParser extends Parser {
    /**
     * @param path Path of the json to parse.
     */
    public MapParser(String path) {
        super(path);
    }

    @Override
    public void parse() {
        super.parse();
        for (JsonValue entry: jsonValue) {
            MapStructure mapStructure = new MapStructure();
            String[] mapList = entry.get("mapList").asStringArray();
            String mapName = entry.name;
            mapStructure.setMapName(mapName);
            mapStructure.setTmxPath(entry.getString("tmxPath"));
            mapStructure.setMapList(new ArrayList<>(Arrays.asList(mapList)));
            mapStructure.setWidth(entry.getInt("width"));
            mapStructure.setHeight(entry.getInt("height"));
            MapRepository map;
            try {
                map = MapManager.getMapFromFactory(mapName).get();
            } catch (Exception e) {
                continue;
            }
            map.setStructure(mapStructure);
            MapManager.insertMap(mapName, map);
        }
    }
}
