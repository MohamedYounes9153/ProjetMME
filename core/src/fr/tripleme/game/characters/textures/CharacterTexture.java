package fr.tripleme.game.characters.textures;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class CharacterTexture {
    protected int cols;
    protected int rows;
    protected Texture walkSheet;
    protected Animation<TextureRegion> upWalk;
    protected Animation<TextureRegion> downWalk;
    protected Animation<TextureRegion> rightWalk;
    protected Animation<TextureRegion> leftWalk;

    /**
     * Constructor
     * @param walkSheet
     */
    public CharacterTexture(Texture walkSheet) {
        this.walkSheet = walkSheet;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public Animation<TextureRegion> getUpWalk() {
        return upWalk;
    }

    public void setUpWalk(Animation<TextureRegion> upWalk) {
        this.upWalk = upWalk;
    }

    public Texture getWalkSheet() {
        return walkSheet;
    }

    public void setWalkSheet(Texture walkSheet) {
        this.walkSheet = walkSheet;
    }

    public Animation<TextureRegion> getDownWalk() {
        return downWalk;
    }

    public void setDownWalk(Animation<TextureRegion> downWalk) {
        this.downWalk = downWalk;
    }

    public Animation<TextureRegion> getRightWalk() {
        return rightWalk;
    }

    public void setRightWalk(Animation<TextureRegion> rightWalk) {
        this.rightWalk = rightWalk;
    }

    public Animation<TextureRegion> getLeftWalk() {
        return leftWalk;
    }

    public void setLeftWalk(Animation<TextureRegion> leftWalk) {
        this.leftWalk = leftWalk;
    }
}
