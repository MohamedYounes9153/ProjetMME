package fr.tripleme.game.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import fr.tripleme.game.characters.textures.CharacterTexture;
import fr.tripleme.game.coordinates.Coordinates;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int hpmax;
    protected Coordinates coord;
    protected int id;
    protected float movespeed;
    protected Rectangle body;
    protected CharacterTexture characterTextures;

    public Character(String name, int hpmax, int id, Coordinates coord, int movespeed, Texture walkSheet) {
        this.name = name;
        this.hp = hpmax;
        this.hpmax = hpmax;
        this.id = id;
        this.coord = coord;
        this.movespeed = movespeed;
        this.body = new Rectangle();
        this.characterTextures = new CharacterTexture(walkSheet);
    }
    // Getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getHpmax(){
        return this.hpmax;
    }
    public int getHp(){
        return this.hp;
    }
    public Coordinates getCoord(){
        return this.coord;
    }

    public float getMovespeed(){
        return this.movespeed;
    }

    /**
     * Get the rectangle body of the character.
     * @return Rectangle
     */
    public Rectangle getBody() {
        return this.body;
    }

    /**
     * Get the walksheet texture of the character.
     * @return Texture
     */
    public CharacterTexture getCharacterTextures() {
        return this.characterTextures;
    }

    // Setters

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setHpmax(int hpmax){
        this.hpmax=hpmax;
    }
    public void setHp(int hp){
        this.hp=hp;
    }
    public void setCoord(Coordinates coord){
        this.coord=coord;
    }
    public void setMovespeed(float ms){
        this.movespeed=ms;
    }

    /**
     * Set the rectangle body of the character.
     * @param body
     */
    public void setBody(Rectangle body) {
        this.body = body;
    }

    /**
     * Set the walksheet texture of the character.
     * @param characterTextures
     */
    public void setCharacterTextures(CharacterTexture characterTextures) {
        this.characterTextures = characterTextures;
    }
}
