package fr.tripleme.game.characters;
import com.badlogic.gdx.graphics.Texture;
import fr.tripleme.game.characters.Character;
import fr.tripleme.game.coordinates.Coordinates;

public class Monster extends Character {
    private int dps;

    public Monster(String name, int hpmax, int id, Coordinates coord, int movespeed, int dps, Texture walkSheet){
        super(name,hpmax,id,coord,movespeed, walkSheet);
        this.hp = hpmax;
        this.dps = dps;
    }

    /**
     * Get dealt damages by the Monster.
     * @return int
     */
    public int getDps() {
        return dps;
    }

    /**
     * Set dealt damages by the Monster.
     * @param dps
     */
    public void setDps(int dps) {
        this.dps = dps;
    }

    /* Pas bon, le while true va bloquer le main thread
    public void runToPlayer(Coordinates playercoords, float deltatime){
        while(true){
            if (Math.sqrt(Math.pow(playercoords.getfX()-this.coord.getfX(),2.)+Math.pow(playercoords.getfY()-this.coord.getfY(),2.))<10.){
                Coordinates vectorMonsterToPlayer = new Coordinates(playercoords.getfX()-this.coord.getfX(), playercoords.getfY()-this.coord.getfY());
                this.coord.setfX(this.coord.getfX()+deltatime*this.movespeed*vectorMonsterToPlayer.getfX());
                this.coord.setfY(this.coord.getfY()+deltatime*this.movespeed*vectorMonsterToPlayer.getfY());
            }
        }
    }*/
}
