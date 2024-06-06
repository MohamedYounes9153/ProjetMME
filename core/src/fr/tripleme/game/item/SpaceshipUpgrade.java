package fr.tripleme.game.item;

import fr.tripleme.game.craft.recipies.ItemRecipe;
import fr.tripleme.game.craft.recipies.Recipe;
import fr.tripleme.game.item.Item;

import java.util.ArrayList;

public class SpaceshipUpgrade extends Item {
    int level;
    private ItemRecipe recipe;

    //---------------------Constructor--------------------------------
    public SpaceshipUpgrade(String name, String m, int id,int q, int level) {
        super(name, m, id, q);
        this.level = level;
        ArrayList<Item> recipients = new ArrayList<Item>();
    }

    //-----------------Getters/Setters--------------------------------
    public int getQuantity() {return super.getQuantity();}

    public void setQuantity(int quantity) {super.setQuantity(quantity);}

    //-------------------------Methods--------------------------------

}

