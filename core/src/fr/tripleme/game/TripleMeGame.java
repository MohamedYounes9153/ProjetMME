package fr.tripleme.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import fr.tripleme.game.characters.player.Player;
import fr.tripleme.game.characters.player.inputs.PlayerInputProcessor;
import fr.tripleme.game.manager.GameManager;
import fr.tripleme.game.maps.worlds.MapRepository;

public class TripleMeGame extends ApplicationAdapter {
    private final String mapPath = "configs/maps.json";
    private GameManager gameManager = null;
    private PlayerInputProcessor inputProcessor = null;
    float stateTime = 0f;
    Music music;

    @Override
    public void create() {
        // We take our GameManager everything is loaded from start
        this.gameManager = GameManager.getInstance(mapPath);
        this.inputProcessor = new PlayerInputProcessor(this.gameManager.getPlayer(), this.gameManager.getPlayer().getBody());
        Gdx.input.setInputProcessor(this.inputProcessor);
        this.music = Gdx.audio.newMusic(Gdx.files.internal("songs/main_theme.mp3"));
        this.music.setVolume(0.7f);
        this.music.setLooping(true);
        this.music.play();
        /*
        CollisionEvent collisionEvent = new CollisionEvent(mapObject);
        eventBus.register(OnObjectCollision.class);
        eventBus.register(OnPlayerCollision.class);
        try {
            eventBus.call(collisionEvent);
        } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException |
                 InstantiationException e) {
            throw new RuntimeException(e);
        }
        */
    }

    @Override
    public void render() {
        // Clear screen
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stateTime += Gdx.graphics.getDeltaTime();
        Player player = this.gameManager.getPlayer();
        Rectangle body = player.getBody();

        this.gameManager.getExtendViewport().apply();
        OrthographicCamera camera = this.gameManager.getCamera();

        // Render camera positions
        this.gameManager.setCameraRender();

        // Set view perspective on camera
        this.gameManager.getActualMap().getRenderer().setView(camera);
        // Render
        this.gameManager.getActualMap().getRenderer().render();
        this.inputProcessor.updateMotion();

        // Render player
        SpriteBatch batch = this.gameManager.getSpriteBatch();
        batch.setProjectionMatrix(camera.combined);

        // Render player animation
        TextureRegion currentFrame = this.inputProcessor.getCorrespondingAnimation(stateTime);


        // Begin draw
        batch.begin();
        batch.draw(currentFrame, this.inputProcessor.getPlayerX(), this.inputProcessor.getPlayerY(), body.getWidth(), body.getHeight());
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        this.gameManager.setCamera(width, height);
    }

    @Override
    public void dispose() {
        /*
        inventoryScreenC.dispose();
        inventoryScreenR.dispose();
        inventoryScreenE.dispose();*/
    }
}
