package fr.tripleme.game.maps.structure;

import com.badlogic.gdx.maps.MapObject;

import java.util.ArrayList;
import java.util.HashSet;

public interface MapStructurer {
    public void setMapList(ArrayList<String> mapList);
    public ArrayList<String> getMapList();
    public void setMapName(String mapName);
    public String getMapName();
    public void registerMap(String mapName);
    public void setTmxPath(String tmxPath);
    public String getTmxPath();
    public HashSet<MapObject> getMapObjectSet();
    public void setMapObject(MapObject mapObject);
}
