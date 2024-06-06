package fr.tripleme.game.characters.player;

public class GameContext {
    private PlayerState state =null;
    private Player player;
    public void setState(PlayerState state){
        this.state=state;
    }
    public void gameAction(){
        state.action(player);
    }
}
