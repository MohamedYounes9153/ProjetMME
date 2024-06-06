package fr.tripleme.game.room;
import fr.tripleme.game.characters.player.Player;
import fr.tripleme.game.maps.Map;
import fr.tripleme.game.ship.PlayerShip;

public class Room {
    private String name;
    private PlayerShip ship;
    private Map zone; //normalement pas utilisé

    public Room(String n){
        this.name=n;
    }

    //-----------------getters/setters-------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //----------------Methode--------------------------------

}
