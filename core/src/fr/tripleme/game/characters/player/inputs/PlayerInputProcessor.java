package fr.tripleme.game.characters.player.inputs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import fr.tripleme.game.characters.player.Player;

public class PlayerInputProcessor extends InputAdapter {
    private Player player;
    private Rectangle body;
    private final float SPEED = 10f;
    private boolean moveUp;
    private boolean moveDown;
    private boolean moveLeft;
    private boolean moveRight;
    private TextureRegion lastMoveAnimation;

    public PlayerInputProcessor(Player player, Rectangle body) {
        this.player = player;
        this.body = body;
    }

    @Override
    public boolean keyDown(int keycode) {
        switch (keycode) {
            case Input.Keys.W:
                this.moveUp = true;
                break;
            case Input.Keys.A:
                this.moveLeft = true;
                break;
            case Input.Keys.S:
                this.moveDown = true;
                break;
            case Input.Keys.D:
                this.moveRight = true;
                break;
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        switch (keycode) {
            case Input.Keys.W:
                moveUp = false;
                break;
            case Input.Keys.A:
                moveLeft = false;
                break;
            case Input.Keys.S:
                moveDown = false;
                break;
            case Input.Keys.D:
                moveRight = false;
                break;
        }
        return true;
    }

    /**
     * Update player motion
     */
    public void updateMotion() {
        float deltaTime = Gdx.graphics.getDeltaTime();
        if (moveUp && !(moveRight || moveLeft)) {
            this.body.y += SPEED * deltaTime;
        }
        if (moveDown && !(moveRight || moveLeft)) {
            this.body.y -= SPEED * deltaTime;
        }
        if (moveLeft) {
            this.body.x -= SPEED * deltaTime;
        }
        if (moveRight) {
            this.body.x += SPEED * deltaTime;
        }
    }

    /**
     * Update player motion
     */
    public TextureRegion getCorrespondingAnimation(float stateTime) {
        if (moveUp && !(moveRight || moveLeft)) {
            lastMoveAnimation = this.player.getPlayerTexture().getUpWalk().getKeyFrame(0);
            return this.player.getPlayerTexture().getUpWalk().getKeyFrame(stateTime, true);
        }
        if (moveDown && !(moveRight || moveLeft)) {
            lastMoveAnimation = this.player.getPlayerTexture().getDownWalk().getKeyFrame(0);
            return this.player.getPlayerTexture().getDownWalk().getKeyFrame(stateTime, true);
        }
        if (moveLeft) {
            lastMoveAnimation = this.player.getPlayerTexture().getLeftWalk().getKeyFrame(4);
            return this.player.getPlayerTexture().getLeftWalk().getKeyFrame(stateTime, true);
        }
        if (moveRight) {
            lastMoveAnimation = this.player.getPlayerTexture().getRightWalk().getKeyFrame(0);
            return this.player.getPlayerTexture().getRightWalk().getKeyFrame(stateTime, true);
        }
        if (lastMoveAnimation != null) {
            return lastMoveAnimation;
        }
        return this.player.getPlayerTexture().getDownWalk().getKeyFrame(0);
    }


    public float getPlayerX() {
        return this.body.x; // Convertir en pixels pour le rendu
    }

    public float getPlayerY() {
        return this.body.y; // Convertir en pixels pour le rendu
    }
}
