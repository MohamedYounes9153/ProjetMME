package fr.tripleme.game.events.collisions;

import com.badlogic.gdx.maps.MapObject;
import fr.tripleme.game.events.Event;

public class CollisionEvent implements Event {
    private MapObject collisionObject;
    public CollisionEvent(MapObject mapObject) {
        this.collisionObject = mapObject;
    }

    /**
     * Get collision object.
     * @return
     */
    public MapObject getCollisionObject() {
        return collisionObject;
    }

    /**
     * Set collision object.
     * @param collisionObject
     */
    public void setCollisionObject(MapObject collisionObject) {
        this.collisionObject = collisionObject;
    }
}
