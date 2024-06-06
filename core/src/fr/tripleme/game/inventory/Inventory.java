package fr.tripleme.game.inventory;
import fr.tripleme.game.item.Item;

import java.util.ArrayList;

public class Inventory{
    private String name;
    private int id;
    //HashMap<..., ...> onglet; ou arraylist
    private final ArrayList<Item> inventory_item;
    //---------------------Constructeur--------------------------------
    public Inventory(String name,int id){
        this.name=name;
        this.id=id;
        this.inventory_item = new ArrayList<Item>();
    }
    //-----------------Getters/Setters--------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Item> getInventoryItem() {
        return inventory_item;
    }

    //--------------------methods--------------------------------------------
    public void addItem2List(Item item){
        //methode permettant d'ajouter des items dans un inventaire (ici une hashmap)
        // utilisé notamment par initialiser(...) classe ListItem
        for(Item i: this.inventory_item) {
            if (i.getName().equals(item.getName())) {
                return;
            }
        }
        this.inventory_item.add(item);
    }
    public void removeItemList(Item item){//inutile pour le moment !
        for(Item i: this.inventory_item) {
            if (i.getName().equals(item.getName())) {
                this.inventory_item.remove(i);
            }
        }
    }
}
