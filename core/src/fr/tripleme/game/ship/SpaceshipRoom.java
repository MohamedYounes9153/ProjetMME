package fr.tripleme.game.ship;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import fr.tripleme.game.maps.structure.MapStructure;
import fr.tripleme.game.maps.worlds.MapRepository;

public class SpaceshipRoom extends MapRepository {

    public SpaceshipRoom() {
    }

    @Override
    public void render(OrthographicCamera camera) {

    }

    /*
     * @param layers
     */
    @Override
    public void render(int[] layers) {

    }

    /**
     *
     */
    @Override
    public void loadTiledMap() {

    }

    /**
     *
     */
    @Override
    public void loadObjects() {

    }

    /**
     * @return
     */
    @Override
    public OrthogonalTiledMapRenderer getRenderer() {
        return this.renderer;
    }

    /**
     * @return
     */
    @Override
    public MapStructure getStructure() {
        return null;
    }

    /*
     * @param structure
     */
    @Override
    public void setStructure(MapStructure structure) {

    }

    @Override
    public void dispose() {

    }


}
