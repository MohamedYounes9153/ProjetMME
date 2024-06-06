package fr.tripleme.game.maps.worlds;

import fr.tripleme.game.maps.Map;

public abstract class MapRepository extends Map implements MapBase {
    public abstract void dispose();
}
