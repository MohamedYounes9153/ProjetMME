package fr.tripleme.game.maps.worlds;

import fr.tripleme.game.maps.structure.MapStructure;

public interface MapBase {
    MapStructure getStructure();
    void setStructure(MapStructure structure);
}
