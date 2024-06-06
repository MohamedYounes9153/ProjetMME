package fr.tripleme.game.coordinates;

public class Coordinates {
    private int x;
    private int y;
    private float fX;
    private float fY;
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates(float x, float y) {
        this.fX = x;
        this.fY = y;
    }

    /**
     * Get X coordinate.
     * @return int
     */
    public int getX() {
        return x;
    }

    /**
     * Set x coordinates.
     * @param x X coordinate.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Get Y coordinate.
     * @return int
     */
    public int getY() {
        return y;
    }

    /**
     * Set Y coordinate.
     * @param y Y coordinate.
     */
    public void setY(int y) {
        this.y = y;
    }

    public float getfX() {
        return fX;
    }

    public void setfX(float fX) {
        this.fX = fX;
    }

    public float getfY() {
        return fY;
    }

    public void setfY(float fY) {
        this.fY = fY;
    }
}
