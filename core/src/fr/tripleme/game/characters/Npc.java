package fr.tripleme.game.characters;

import com.badlogic.gdx.graphics.Texture;
import fr.tripleme.game.coordinates.Coordinates;
import fr.tripleme.game.inventory.NpcInventory;

public class Npc extends Character {
    private String message;
    private NpcInventory inventory;

    public Npc(String name, int hpmax, int id, Coordinates coord, int movespeed, String message, NpcInventory inventory, Texture walkSheet) {
        super(name, hpmax, id, coord, movespeed, walkSheet);
        this.inventory = inventory;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NpcInventory getInventory() {
        return inventory;
    }

    public void setInventory(NpcInventory inventory) {
        this.inventory = inventory;
    }
}