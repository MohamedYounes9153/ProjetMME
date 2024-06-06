package fr.tripleme.game.characters.player;

public class DeadState implements PlayerState{
    @Override
    public void action(Player p1) {
        p1.attack();
        //p1.eat(Consumable item);
    }
}
