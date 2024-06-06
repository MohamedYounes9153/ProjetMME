package fr.tripleme.game.craft.craftingtable;

import fr.tripleme.game.item.Item;
import java.util.ArrayList;

public class CraftingTable {
    private String name;
    private int level;
    private ArrayList<Item> crafts;


    //---------------------Constructor--------------------------------
    public CraftingTable(String name){
        this.name=name;
        this.level=1;
        this.crafts = new ArrayList<>();
    }

    //-----------------Getters/Setters--------------------------------
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int lvl) {
        this.level = lvl;
    }

    public ArrayList<Item> getCraftableItems() {return this.crafts;}
    public void setCraftableItems(ArrayList<Item> items) {this.crafts = items;}
    public void add_crafts(Item r) {this.crafts.add(r);}
    public void rmv_crafts(Item r) {this.crafts.remove(r);}

    //--------------------methods--------------------------------------------
}