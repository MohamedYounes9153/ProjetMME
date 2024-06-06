package fr.tripleme.game.menu;

import com.sun.org.apache.xpath.internal.operations.Bool;
import fr.tripleme.game.item.Item;

import java.util.HashMap;

public class ItemMenu implements ItemMenuInterface{
    private String name;
    private int id;
    private HashMap<Integer,? extends Menu> objet;//elements de l'ItemMenu
    private Boolean isMenu;


    //----------constructeur------------------------------
    public ItemMenu(String name, int id){
        this.name=name;
        this.id=id;
        this.objet=new HashMap<Integer,Menu>();
    }

    //--------------------------Getters/Setters-----------------------
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Menu getObjet(Menu o){
        return this.objet.get(o.getId());
    }

    //-----------------Methods------------------------
    @Override
    public void execute() {

    }

}
