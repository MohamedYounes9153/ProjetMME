package fr.tripleme.game.menu;

import com.badlogic.gdx.utils.Null;

import java.util.HashMap;
import java.util.List;import java.util.ArrayList;

public abstract class Menu{
    private String name;
    private int id;
    private HashMap<Integer,ItemMenu> items;//element du menu
    private Boolean iscurrent;

    //-------------constructeur----------------------------

    public Menu(String name,int id){
        this.id=id;
        this.name=name;
        this.items = new HashMap<>();
        this.iscurrent=false;
    }

    //---------------Getters/setters-------------------------
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

    public Boolean getIscurrent() {
        return iscurrent;
    }

    public void setIscurrent() {
        if(this.iscurrent){
            this.iscurrent=false;
        }
        else{
            this.iscurrent=true;
        }
    }

    //---------------Methode---------------------------------

    public ItemMenu findItems(ItemMenu i){
        if(this.items.containsValue(i)){
           return this.items.get(i.getId());
        }
        return null;
    }
    public void addItemToMenu(ItemMenu itemMenu){
        if(!this.items.containsValue(itemMenu)){
            this.items.put(itemMenu.getId(),itemMenu);
        }
    }
    /*public Menu currentMenu(){
        if(this.iscurrent){
            return this;
        }
        else{
            for (ItemMenu itemMenu : this.items.values()){
                if(this.getObjet(itemMenu).iscurrent)
            }
        }
        return null;
    }*/
    public void initMenu(ItemMenu[] list){
        for( ItemMenu menu : list){
            this.addItemToMenu(menu);
        }
    }

    public void afficheMenu(){
        for (ItemMenu item : this.items.values()){

        }
    }
}
