package fr.tripleme.game.craft.recipies;

import fr.tripleme.game.item.Item;

import java.util.ArrayList;

public class Recipe {
    protected ArrayList<Item> recipients;
    int quantity;

    //---------------------Constructeur--------------------------------
    public Recipe(ArrayList<Item> recipients, int quantity) {
        this.recipients = new ArrayList<>(); this.recipients.addAll(recipients); this.quantity = quantity;
    }

    //-----------------Getters/Setters--------------------------------
    public ArrayList<Item> getRecipients() {
        return recipients;
    }

    public void addRecipient(Item item, Integer n) { recipients.add(item);}

    public void setRecipients(ArrayList<Item> recipients) {this.recipients = recipients;}

    public int getQuantity() {return this.quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}
}
