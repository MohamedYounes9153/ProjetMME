package fr.tripleme.game.section;

import fr.tripleme.game.room.Room;

import java.util.HashMap;

public class SectionRoom extends Section<String, Room>{
    private HashMap<String,Room> section;

    public SectionRoom(){
        this.section= new HashMap<String,Room>();
    }
    public void addRoomToSection(Room room){
        if(!this.section.containsValue(room)){
            this.section.put(room.getName(),room);
        }
    }
}
