package fr.tripleme.game.manager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import fr.tripleme.game.characters.player.CurrentPlayerState;
import fr.tripleme.game.characters.player.Player;
import fr.tripleme.game.characters.textures.player.PlayerTexture;
import fr.tripleme.game.coordinates.Coordinates;
import fr.tripleme.game.events.EventBus;
import fr.tripleme.game.maps.manager.MapManager;
import fr.tripleme.game.maps.worlds.MapRepository;
import fr.tripleme.game.parsing.configs.MapParser;

public class GameManager {
    private static GameManager instance = null;
    private OrthographicCamera camera = null;
    private ExtendViewport viewport = null;
    private MapParser mapParser = null;
    private EventBus eventBus = null;
    private SpriteBatch spriteBatch = null;
    private MapRepository actualMap = null;
    private TiledMap tiledMap = null;
    private Player player = null;

    /**
     * Constructor.
     * @param mapsPath
     */
    private GameManager(String mapsPath) {
        this.camera = new OrthographicCamera();

        // Parse maps cfg
        this.mapParser = new MapParser(mapsPath);
        this.mapParser.parse();

        // Load Maps
        this.actualMap = MapManager.maps.get("landingMap");
        this.actualMap.loadTiledMap();
        this.tiledMap = actualMap.getTiledMap();

        // Create player
        Coordinates coordinates = new Coordinates(32, 32);
        Texture walkSheet = new Texture(Gdx.files.internal("character/momoka_sheet.png"));

        // Here movespeed corresponds to a 1 unit = 16 pixels walk.
        this.player = new Player("Momoka", 100, 0, coordinates, 1, CurrentPlayerState.DOWN, this.actualMap, walkSheet);
        Rectangle rectangle = this.player.getBody();
        // Basic position at the middle, need to take it from the database nexttime
        rectangle.set(32f, 32f, 1.8f, 1.8f);
        // Set columns and rows for the texture.
        PlayerTexture playerTextures = this.player.getPlayerTexture();
        playerTextures.setCols(4);
        playerTextures.setRows(4);
        playerTextures.setAnimations();

        // Get Event Bus
        this.eventBus = EventBus.getInstance();

        // Sprite Bach
        this.spriteBatch = new SpriteBatch();

        // Viewport
        int width = this.actualMap.getStructure().getWidth();
        int height = this.actualMap.getStructure().getHeight();
        this.camera.setToOrtho(false, width/16f, height/16f);
        this.viewport = new ExtendViewport(width/16f, height/16f, camera);
    }

    /**
     * Get instance of GameManager.
     * @param mapsPath
     * @return
     */
    public static GameManager getInstance(String mapsPath) {
        if (instance == null) {
            instance = new GameManager(mapsPath);
        }
        return instance;
    }

    /**
     * Update camera
     * @param width
     * @param height
     */
    public void setCamera(int width, int height) {
        this.camera.position.set(this.player.getBody().x, this.player.getBody().y, 0);
        this.viewport.update(width, height);
    }

    public void setCameraRender() {
        camera.zoom = 0.4f;
        // Get good units for the map
        float mapWidthInUnits = this.actualMap.getStructure().getWidth() / 16f;
        float mapHeightInUnits = this.actualMap.getStructure().getHeight() / 16f;

        // Camera view limits considering zoom
        float halfCameraViewWidth = (camera.viewportWidth * camera.zoom) / 2;
        float halfCameraViewHeight = (camera.viewportHeight * camera.zoom) / 2;

        // Current player position
        float playerX = this.player.getBody().x;
        float playerY = this.player.getBody().y;

        // Ensure the camera does not exceed map boundaries
        float positionX = Math.max(halfCameraViewWidth, Math.min(playerX, mapWidthInUnits - halfCameraViewWidth));
        float positionY = Math.max(halfCameraViewHeight, Math.min(playerY, mapHeightInUnits - halfCameraViewHeight));

        camera.position.set(positionX, positionY, 0);
        camera.update();
    }




    /**
     * Change the map
     * @param mapName
     */
    public void changeMap(String mapName) {
        this.actualMap = (MapRepository) MapManager.getMapFromFactory(mapName);
        this.tiledMap = actualMap.getTiledMap();
    }

    public OrthographicCamera getCamera() {
        return camera;
    }

    public void setCamera(OrthographicCamera camera) {
        this.camera = camera;
    }

    public ExtendViewport getExtendViewport() {
        return viewport;
    }

    public void setViewport(ExtendViewport viewport) {
        this.viewport = viewport;
    }

    public MapParser getMapParser() {
        return mapParser;
    }

    public void setMapParser(MapParser mapParser) {
        this.mapParser = mapParser;
    }

    public EventBus getEventBus() {
        return eventBus;
    }

    public void setEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public SpriteBatch getSpriteBatch() {
        return spriteBatch;
    }

    public void setSpriteBatch(SpriteBatch spriteBatch) {
        this.spriteBatch = spriteBatch;
    }

    public MapRepository getActualMap() {
        return actualMap;
    }

    public void setActualMap(MapRepository actualMap) {
        this.actualMap = actualMap;
    }

    public TiledMap getTiledMap() {
        return tiledMap;
    }

    public void setTiledMap(TiledMap tiledMap) {
        this.tiledMap = tiledMap;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
