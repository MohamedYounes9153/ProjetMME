package fr.tripleme.game.item;

import fr.tripleme.game.craft.recipies.ItemRecipe;

public class ConsumableItem extends Item{
    private int hpGain;
    //private String effect;
    private int duration;
    private ItemRecipe recipe;

    public ConsumableItem(String name, String m, int id, int d, int hp, int q) {
        super(name, m, id,q);
        this.duration=d;
        this.hpGain=hp;
        this.recipe=null;
    }

    //-------------------------Getters/Setters----------------------------------
    public int getHpGain() {return hpGain;}

    public int getDuration() {
        return duration;
    }

    public void setHpGain(int hpGain) {
        this.hpGain = hpGain;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
