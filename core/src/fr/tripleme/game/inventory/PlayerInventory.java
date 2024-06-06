package fr.tripleme.game.inventory;

import fr.tripleme.game.section.SectionInventory;
import fr.tripleme.game.characters.player.Player;

import java.util.HashMap;

public class PlayerInventory extends Inventory{
    private SectionInventory inventaire;
    private Player p1;
    public PlayerInventory(String name,int id) {
        super(name,id);
        this.inventaire = new SectionInventory();
    }
    public HashMap<Integer, Inventory> getInventaire(){//obtenir les differentes sections de l'inventaire
        return inventaire.getSection();
    }
}
