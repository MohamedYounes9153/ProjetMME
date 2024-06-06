package fr.tripleme.game.item;

import fr.tripleme.game.craft.recipies.ItemRecipe;

public class EquipmentItem extends Item{
    private int damage;
    private int armor;
    private int range; //like 32px for a blaster, 10px for a sword
    private ItemRecipe recipe;

    //-------------------------constructor--------------------------
    public EquipmentItem(String name, String m, int id, int dps,int a, int range,int q) {
        super(name, m, id,q);
        this.damage=dps;
        this.armor=a;
        this.range=range;
        this.recipe=null;
    }

    //------------------Getters/Setters---------------------------------
    public int getDamage() {
        return damage;
    }

    public int getDurability() {
        return armor;
    }

    public int getRange() {
        return range;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDurability(int a) {
        this.armor = a;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
