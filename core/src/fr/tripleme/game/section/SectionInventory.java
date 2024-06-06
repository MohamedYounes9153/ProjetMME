package fr.tripleme.game.section;
import fr.tripleme.game.inventory.Inventory;
import java.util.HashMap;

public class SectionInventory extends Section<Integer,Inventory>{
    private HashMap <Integer, Inventory> section;

    //---------------constructeur-----------------------------------------
    public SectionInventory(){
        this.section=new HashMap<Integer, Inventory>();
    }

    //---------------------------getters/setters--------------------------
    public Inventory getInventoryFromSection(int key){
        return this.section.get(key);
    }
    public HashMap<Integer, Inventory> getSection(){//inutile sur le papier
        return section;
    }

    //----------------------Methode---------------------------------------
    public void addInventoryToSection(Inventory i){
        if (!this.section.containsValue(i)){
            this.section.put(i.getId(),i);
        }
    }
}
