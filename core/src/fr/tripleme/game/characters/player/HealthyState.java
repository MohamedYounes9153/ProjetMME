package fr.tripleme.game.characters.player;

//import javafx.scene.input.KeyCode;
import java.awt.event.KeyEvent;

public class HealthyState implements PlayerState{


    private KeyEvent keycode;
    @Override
    public void action(Player p1) {
        p1.attack();
        //p1.eat(ConsumableItem p1.getInventory().getItem());
        //p1.move(p1,KeyEvent keycode);
    }
}

