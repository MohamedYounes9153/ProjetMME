package fr.tripleme.game.ship;

import fr.tripleme.game.craft.craftingtable.CraftingTable;
import fr.tripleme.game.craft.craftinventory.Equipment;
import fr.tripleme.game.inventory.Inventory;
import fr.tripleme.game.inventory.ShipInventory;
import fr.tripleme.game.item.*;
import fr.tripleme.game.room.Room;
import fr.tripleme.game.section.SectionRoom;

import java.util.HashMap;

public class PlayerShip extends SpaceShip{
    private int level;
    private CraftingTable craftingTable;
    //les différentes actions en fonction des rooms

    public PlayerShip(int lv,String n){
        this.level=1;
        this.name=n;
        this.craftingTable = new CraftingTable("craftingtable");
        ListItem listitem = new ListItem("listitem");
        ConsumableItem[] liste_consumables = listitem.getListe_consommable();
        EquipmentItem[] liste_equipements = listitem.getListe_equipement();
        RessourceItem[] liste_ressources = listitem.getListe_ressource();
        SpaceshipUpgrade[] liste_spaceshipupgrade = listitem.getListe_spaceshipupgrade();
        this.craftingTable.add_crafts(liste_spaceshipupgrade[0]); // upgrade spaceship to lvl 2
        this.craftingTable.add_crafts(liste_consumables[10]); //salade1
        this.craftingTable.add_crafts(liste_consumables[14]); //viande cuite
        this.craftingTable.add_crafts(liste_consumables[13]); //viande sechee
    }
    //----------------------getters/setters---------------------------------
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public CraftingTable getCraftingTable(){return craftingTable;}

    public void setCraftingTable(CraftingTable craftingTable){this.craftingTable = craftingTable;}


    //----------------------Methode---------------------------------
    public void upgrade(){
        switch (level){
            case 1:
                this.level = 2;
            case 2:
                this.level= 3;
            case 3:
                this.level= 4;
            default:
                System.out.println("Error: level out of bounds");
        }
    }
}
