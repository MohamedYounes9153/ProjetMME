package fr.tripleme.game.craft.recipies;

import fr.tripleme.game.item.Item;

import java.util.ArrayList;

public class ItemRecipe extends Recipe{

    //---------------------Constructeur--------------------------------
    public ItemRecipe(ArrayList<Item> recipients, int quantity) {
        super(recipients, quantity);
        this.recipients = new ArrayList<Item>(); this.recipients.addAll(recipients);
    }

    //-----------------Getters/Setters--------------------------------
    public ArrayList<Item> getRecipients() {
        return super.getRecipients();
    }

    public void addRecipient(Item item, Integer n) { super.addRecipient(item, n); ;}

    public void setRecipients(ArrayList<Item> recipients) {super.setRecipients(recipients);}

    public int getQuantity() {return super.getQuantity();}

    public void setQuantity(int quantity) {super.setQuantity(quantity);}
}
