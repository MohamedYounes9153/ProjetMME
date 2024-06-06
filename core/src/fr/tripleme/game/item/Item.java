package fr.tripleme.game.item;

import fr.tripleme.game.craft.recipies.ItemRecipe;

public class Item {
    private String name;
    private String description;
    private int id;
    private int quantity;
    private ItemRecipe recipe;

    //-----------------constructor-----------------------------------------------
    public Item(String name, String m, int id,int q) {
        this.name = name;
        this.description=m;
        this.id=id;
        this.quantity=q;
        this.recipe=null;
    }
    //-------------------------------Getters/Setters------------------------------
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ItemRecipe getRecipe() {return this.recipe;}

    public void setRecipe(ItemRecipe recipe) {this.recipe = recipe;}

    //---------------------------Methodes---------------------------
    public void addQuantity(int n){
        int old = this.quantity;
        int new_val = old + n;
        this.setQuantity(new_val);
    }
    public void removeQuantity(int n){
        int old = this.quantity;
        int new_val = old - n;
        if (new_val < 0){
            this.setQuantity(0);
        }
        else{
            this.setQuantity(new_val);
        }
    }
}