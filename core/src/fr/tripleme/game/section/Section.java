package fr.tripleme.game.section;

import java.util.HashMap;

public class Section<K,V> {
    private HashMap<K,V> section;

    public Section(){
        this.section = new HashMap<K,V>();
    }

}
