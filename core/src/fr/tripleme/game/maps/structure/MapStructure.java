package fr.tripleme.game.maps.structure;

import com.badlogic.gdx.maps.MapObject;

import java.util.ArrayList;
import java.util.HashSet;

public final class MapStructure implements MapStructurer {
    private ArrayList<String> mapList;
    private String mapName;
    private String tmxPath;
    private final HashSet<MapObject> mapObjects = new HashSet<>(16);
    private int width;
    private int height;

    @Override
    public void setMapList(ArrayList<String> mapList) {
        this.mapList = mapList;
    }

    @Override
    public ArrayList<String> getMapList() {
        return mapList;
    }

    @Override
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    @Override
    public String getMapName() {
        return this.mapName;
    }

    @Override
    public void registerMap(String mapName) {
        mapList.add(mapName);
    }

    @Override
    public void setTmxPath(String tmxPath) {
        this.tmxPath = tmxPath;
    }

    @Override
    public String getTmxPath() {
        return this.tmxPath;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Get the map object set.
     * @return
     */
    @Override
    public HashSet<MapObject> getMapObjectSet() {
        return this.mapObjects;
    }

    /**
     * Insert a map object into the set.
     * @param mapObject
     */
    @Override
    public void setMapObject(MapObject mapObject) {
        this.mapObjects.add(mapObject);
    }
}
