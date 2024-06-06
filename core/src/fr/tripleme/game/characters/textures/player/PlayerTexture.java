package fr.tripleme.game.characters.textures.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import fr.tripleme.game.characters.textures.CharacterTexture;

public class PlayerTexture extends CharacterTexture  implements Textural {
    /**
     * Constructor
     *
     * @param walkSheet
     */
    public PlayerTexture(Texture walkSheet) {
        super(walkSheet);
    }

    /**
     * Set Player animations
     */
    public void setAnimations() {
        TextureRegion[][] tmp = TextureRegion.split(walkSheet,
                walkSheet.getWidth() / this.cols,
                walkSheet.getHeight() / this.rows);
        int index = 0;
        for (int i = 0; i < rows; i++) {
            TextureRegion[] walkFrames = new TextureRegion[rows];
            for (int j = 0; j < cols; j++) {
                walkFrames[index++] = tmp[i][j];
            }
            switch (i) {
                case 0: {
                    this.downWalk = new Animation<>(0.25f, walkFrames);
                }
                case 1: {
                    this.upWalk = new Animation<>(0.25f, walkFrames);
                }
                case 2: {
                    this.rightWalk = new Animation<>(0.25f, walkFrames);
                }
                case 3: {
                    this.leftWalk = new Animation<>(0.25f, walkFrames);
                }
            }
            index = 0;
        }
    }
}
