package fr.tripleme.game.characters.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import fr.tripleme.game.characters.Character;
import fr.tripleme.game.characters.textures.player.PlayerTexture;
import fr.tripleme.game.coordinates.Coordinates;
import fr.tripleme.game.craft.recipies.ItemRecipe;
import fr.tripleme.game.inventory.PlayerInventory;
import fr.tripleme.game.item.ConsumableItem;
import fr.tripleme.game.maps.worlds.MapRepository;
import fr.tripleme.game.ship.PlayerShip;
import fr.tripleme.game.item.Item;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Player extends Character {
    private PlayerInventory inventory;
    private PlayerShip house;
    private PlayerState state;
    private MapRepository currentMap;
    private CurrentPlayerState currentPlayerState;
    private PlayerTexture playerTexture;

    public Player(String name, int hpmax, int id, Coordinates coord, int movespeed, PlayerShip house, PlayerInventory inventory, PlayerState state, Texture walkSheet) {
        super(name, hpmax, id, coord, movespeed, walkSheet);
        this.house=house;
        this.inventory = new PlayerInventory(name,0);
        this.state = null;
        this.playerTexture = new PlayerTexture(walkSheet);
    }

    public Player(String name, int hpmax, int id, Coordinates coord, int movespeed, CurrentPlayerState currentPlayerState, MapRepository currentMap, Texture walkSheet) {
        super(name, hpmax, id, coord, movespeed, walkSheet);
        this.state = null;
        this.inventory = new PlayerInventory(name,0);
        this.currentPlayerState = currentPlayerState;
        this.currentMap = currentMap;
        this.playerTexture = new PlayerTexture(walkSheet);
    }

    //-------------------------------Getters/Setters---------------------------------

    /**
     *
     * @return
     */
    public PlayerInventory getInventoryPlayer() {
        return inventory;
    }

    /**
     *
     * @param inventory
     */
    public void setInventoryPlayer(PlayerInventory inventory) {
        this.inventory = inventory;
    }

    /**
     *
     * @return
     */
    public PlayerShip getHouse() {
        return house;
    }

    /**
     *
     * @param house
     */
    public void setHouse(PlayerShip house) {
        this.house = house;
    }

    /**
     * Return the player texture class.
     * @return
     */
    public PlayerTexture getPlayerTexture() {
        return playerTexture;
    }

    /**
     * Set the player texture class.
     * @param playerTexture
     */
    public void setPlayerTexture(PlayerTexture playerTexture) {
        this.playerTexture = playerTexture;
    }

    //-----------------Méthodes----------------------------

    /**
     *
     */
    public void attack() {

    }

    /**
     *
     * @param item
     */
    public void eat(ConsumableItem item){
        if(this.hp < this.hpmax){
            int pv_manquant = this.hpmax - this.hp;
            if(pv_manquant < item.getHpGain()){
                this.hp=this.hpmax;
            }
            else{
                this.hp+=item.getHpGain();
            }
        }
    }

    /**
     *
     * @return
     */
    public CurrentPlayerState getCurrentPlayerState() {
        return currentPlayerState;
    }

    /**
     *
     * @param currentPlayerState
     */
    public void setCurrentPlayerState(CurrentPlayerState currentPlayerState) {
        this.currentPlayerState = currentPlayerState;
    }

    /**
     *
     */
    public void naviguer() {} //TODO naviguer de menu en menu

    /**
     *
     * @param keyEvent
     */
    public void craft(int keyEvent){
        switch(keyEvent){
            case KeyEvent.VK_C:
                if (this.currentMap.getStructure().getMapName().equals("playership")){
                    Item crafteditem = new Item("a","a",0,0);
                    ArrayList<Item> craftableitems = new ArrayList<Item>();
                    //craftableitems = this.house.craftingtable.get_craftable_items();
                    for (Item item : craftableitems){
                        //TODO ajouter l'item au menu de craft
                    }
                    //TODO afficher la liste des items craftables
                    //...
                    //...
                    //TODO Item sélectionné :
                    ItemRecipe r = crafteditem.getRecipe();
                    for (Item item : r.getRecipients()){
                        for(Item item2 : this.inventory.getInventoryItem()){
                            if(item.getName().equals(item2.getName())){
                                if(item.getQuantity() > item2.getQuantity()){
                                    // Impossible de craft, message erreur
                                    return;
                                }
                            }
                        }
                    }
                    for (Item item : r.getRecipients()){
                        for(Item item2 : this.inventory.getInventoryItem()){
                            if(item.getName().equals(item2.getName())){
                                item2.setQuantity(item2.getQuantity()-item.getQuantity());
                            }
                        }
                    }
                    for(Item item : this.inventory.getInventoryItem()){
                        if(crafteditem.getName().equals(item.getName())){
                            item.setQuantity(item.getQuantity()+r.getQuantity());
                        }
                    }
                }
        }
    }

    /**
     *
     * @param deltatime
     */
    public void monsterCollision(float deltatime){ // à lancer uniquement dans les maps contenant des monstres
        /* Pas bon, bloque le main thread
        while(true){
            for(Monster m : currentMap.getMonsters()){
                if (m.getCoord() == this.coord){
                    if(this.hp - m.getDps() >= 0){
                        this.hp = this.hp - m.getDps(); //TODO gérer avec le framerate pour pas instant OS le perso
                    }
                    else{
                        this.hp = 0;
                    }
                }
            }
        }*/
    }
}