package fr.tripleme.game.menu;

import java.util.HashMap;

public class PrincipalMenu extends Menu{
    private HashMap<Integer,ItemMenu> listMenu;
    public PrincipalMenu(String name,int id) {
        super(name,id);
        this.listMenu=new HashMap<Integer,ItemMenu>();
    }
}
