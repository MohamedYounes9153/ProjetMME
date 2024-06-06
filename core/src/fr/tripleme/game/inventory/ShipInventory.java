package fr.tripleme.game.inventory;

import fr.tripleme.game.section.SectionInventory;

public class ShipInventory extends Inventory{
    SectionInventory inventaire;

    public ShipInventory(String name,int id) {
        super(name,id);
        this.inventaire = new SectionInventory();
        Inventory craft = new Inventory("Table de craft",1);
        this.inventaire.addInventoryToSection(craft);
    }
    public SectionInventory getSectionShip(){
        return inventaire;
    }
}
