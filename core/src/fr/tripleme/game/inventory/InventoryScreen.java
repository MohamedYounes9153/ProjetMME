package fr.tripleme.game.inventory;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import fr.tripleme.game.characters.player.Player;
import fr.tripleme.game.item.Item;
import fr.tripleme.game.item.ListItem;

public class InventoryScreen extends ApplicationAdapter {
    private Stage stage;
    private Table inventoryTable;
    private Skin skin;
    private Button bouton;
    private int key;
    private Player player;

    public InventoryScreen (int key,Player player){
        this.stage=new Stage();
        Gdx.input.setInputProcessor(stage);
        this.skin=new Skin(Gdx.files.internal("neon/skin/neon-ui.json"));
        this.inventoryTable= new Table();
        this.inventoryTable.setSkin(skin);//le json
        this.inventoryTable.setFillParent(true); // Remplir l'écran
        this.stage.addActor(this.inventoryTable);
        this.key=key;
        this.player=player;
    }
    //--------------------------getters/setters-------------------------------------
    public int getKey(){
        return key;
    }
    public void setkey(int k){
        key=k;
    }

    public Skin getSkin(){return this.skin;}
    public Table getInventoryTable() {
        return inventoryTable;
    }
    //-----------------------------Méthodes--------------------------------------
    public <T extends Item> void addInventoryToSection(Inventory i, T[] list, ListItem items){
        PlayerInventory section = this.player.getInventoryPlayer();
        section.getInventaire().put(i.getId(),i);
        Inventory InventoryFromSection = section.getInventaire().get(i.getId());
        for (T item : list){
            items.initialiser(list,InventoryFromSection);
        }
    }
    public void afficheInventaire(String nom, Inventory i){//Permet d'afficher l'inventaire
        this.getInventoryTable().clearChildren();//cette ligne sert à supprimer le précédent affichage et éviter les bug d'affichages
        Label nomInventaire = new Label(nom,this.getSkin());
        this.getInventoryTable().add(nomInventaire).width(100).height(100);
        this.getInventoryTable().row();

        Inventory section = i;

        for (Item item : section.getInventoryItem()) {
            this.getInventoryTable().add(item.getName() + " : "+ item.getQuantity()); // Ajouter des éléments de l'inventaire
            this.getInventoryTable().row(); // Passer à la ligne suivante
        }
    }
    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }
    @Override
    public void dispose() {
        stage.dispose();
        skin.dispose();
    }
}