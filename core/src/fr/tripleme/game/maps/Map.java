package fr.tripleme.game.maps;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import fr.tripleme.game.characters.Monster;

import java.util.ArrayList;

public abstract class Map {
    protected TiledMap tiledMap = null;
    protected OrthogonalTiledMapRenderer renderer;
    protected ArrayList<Monster> monsters;
    public abstract void render(OrthographicCamera camera);
    public abstract void render(int[] layers);
    public abstract void loadTiledMap();
    public abstract void loadObjects();
    public abstract OrthogonalTiledMapRenderer getRenderer();

    /**
     *  Get the tiled Map
     * @return
     */
    public TiledMap getTiledMap() {
        return tiledMap;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }
}