package fr.tripleme.game.menu;

import fr.tripleme.game.inventory.Inventory;
import fr.tripleme.game.item.Item;

import java.util.HashMap;

public class InventaryMenu extends Menu{
    private HashMap<Integer, ItemMenu> listInventaire;
    public InventaryMenu(String name, int id) {
        super(name,id);
        this.listInventaire=new HashMap<Integer,ItemMenu>();
    }

}
