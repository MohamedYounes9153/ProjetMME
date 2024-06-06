package fr.tripleme.game.maps.worlds;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import fr.tripleme.game.maps.structure.MapStructure;

public class FirstMap extends MapRepository {
    private MapStructure mapStructure;

    /**
     *
     */
    public FirstMap() {
        super();
    }

    /**
     *
     * @param camera
     */
    @Override
    public void render(OrthographicCamera camera) {
        if (this.renderer == null) {
            return;
        }
        this.renderer.setView(camera);
        this.renderer.render();
    }

    /**
     *
     * @param layers
     */
    @Override
    public void render(int[] layers) {
        if (this.renderer == null) {
            return;
        }
        this.renderer.render(layers);
    }

    /**
     * @return MapStructure
     */
    @Override
    public MapStructure getStructure() {
        return mapStructure;
    }

    /**
     * @param structure Instance of a MapStructure.
     */
    @Override
    public void setStructure(MapStructure structure) {
        mapStructure = structure;
    }

    @Override
    public void loadTiledMap() {
        // load tiled map
        if (tiledMap != null) {
            return;
        }
        tiledMap = new TmxMapLoader().load(this.mapStructure.getTmxPath());
        // Convert scale to 1 unit = 16 pixels
        renderer = new OrthogonalTiledMapRenderer(tiledMap,  1 / 16f);
    }

    /**
     *
     */
    @Override
    public void loadObjects() {
        // Objects are on the top layer
        MapObjects mapObjects = tiledMap.getLayers().get(tiledMap.getLayers().size() - 1).getObjects();
        if (mapObjects == null) {
            return;
        }
        // Insert map objects into HashSet.
        for (MapObject mapObject : mapObjects) {
            this.mapStructure.setMapObject(mapObject);
        }
    }

    /**
     * @return
     */
    @Override
    public OrthogonalTiledMapRenderer getRenderer() {
        return this.renderer;
    }


    @Override
    public void dispose() {

    }
}
