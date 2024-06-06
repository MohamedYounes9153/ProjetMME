package fr.tripleme.game.item;

import fr.tripleme.game.craft.recipies.ItemRecipe;

public class RessourceItem extends Item{
    private ItemRecipe recipe;

    public RessourceItem(String name, String m, int id, int q) {
        super(name, m, id, q);
        this.recipe = null;
    }
}
