package fr.tripleme.game.item;

import fr.tripleme.game.inventory.Inventory;
import fr.tripleme.game.craft.recipies.ItemRecipe;
import sun.jvm.hotspot.gc.shared.Space;

import java.util.ArrayList;

public class ListItem {
    private String name;
    public ListItem(String n){
        this.name=n;
    }
    //------------------ConsumableItem---------------------------------------------
    ConsumableItem pomme = new ConsumableItem("Pomme","Meilleur fruit du monde",1,1,10,0);
    ConsumableItem banane = new ConsumableItem("Banane","fruit offrant de la régénération sur le temps, les princesses en raffolent",2,10,5,0);
    ConsumableItem carotte = new ConsumableItem("Carotte","consommé, on en dit qu'on aura les fesses rose",3,2,10,0);
    ConsumableItem pomme2terre = new ConsumableItem("Pomme de terre","tres utile pour en faire des plats",4,1,3,0);
    ConsumableItem poire = new ConsumableItem("Poire","fruit juteux",5,1,5,0);
    ConsumableItem tomate = new ConsumableItem("Tomate","tres utile dans divers plats",6,1,10,0);
    ConsumableItem laitue = new ConsumableItem("Laitue","Les tortues en raffolent",7,1,10,0);
    ConsumableItem datte = new ConsumableItem("Datte","3 dattes comme Benzema",8,1,10,0);
    ConsumableItem courgette = new ConsumableItem("Courgette","non ce n'est pas autre chose",9,1,10,0);
    ConsumableItem artichaut = new ConsumableItem("Artichaut","legume au coeur d'or",10,1,10,0);
    ConsumableItem salade1 = new ConsumableItem("Salade de tomate","une salade",11,3,15,0);
    ConsumableItem salade2 = new ConsumableItem("Salade de pomme de terre","salade revigorante",12,3,20,0);
    ConsumableItem viande1 = new ConsumableItem("Viande cru","Viande in vitro, préférable de la manger cuite",13,1,1,0);
    ConsumableItem viande2 = new ConsumableItem("Viande sechee","tres nutritif",14,2,25,0);
    ConsumableItem viande3 = new ConsumableItem("Viande cuite","quoi de mieux qu'un bon steak ... vegetarien bien sur",15,1,30,0);
    ConsumableItem artichaut2 = new ConsumableItem("Coeur d'artichaut","avec un peu de vinaigrette",16,4,15,0);

    //------------------EquipmentItem---------------------------------------------------
    EquipmentItem armure1 = new EquipmentItem("Tenue d'explorateur","la tenue classique obtenue après à la fin de l'entrainement d'explorateur",1,0,10,0,0);
    EquipmentItem armure2 = new EquipmentItem("Tenue d'explorateur lv2","la tenue classique amelioree",2,0,20,0,0);
    EquipmentItem armure3 = new EquipmentItem("Tenue d'explorateur-guerrier","la tenue de guerrier galactique",3,0,30,0,0);
    EquipmentItem armure4 = new EquipmentItem("Tenue astra-namekien","la tenue legendaire",4,0,50,0,0);
    EquipmentItem epee1 = new EquipmentItem("vibro-lame","epee du futur",5,25,0,1,0);
    EquipmentItem epee2 = new EquipmentItem("longue vibro-lame","longue epee du futur",6,20,0,3,0);
    EquipmentItem epee3 = new EquipmentItem("astra vibro-lame","epee legendaire",7,50,10,1,0);
    EquipmentItem gun1 = new EquipmentItem("blaster v1","blaster du futur",8,15,0,10,0);
    EquipmentItem gun2 = new EquipmentItem("blaster v2","blaster du futur amélioré",9,20,0,15,0);
    EquipmentItem gun3 = new EquipmentItem("blaster astra","blaster legendaire",10,30,0,20,0);
    EquipmentItem pioche = new EquipmentItem("micro-foreuse","permet d'extraire des metaux et divers element",11,5,0,1,0);
    EquipmentItem pioche2 = new EquipmentItem("extracteur portatif","permet d'extraire des metaux et divers elements",12,5,0,5,0);
    //-----------------------------RessourceItem------------------------------------------------
    RessourceItem iron = new RessourceItem("Fer","minerai de base trouvable dans une planete",1,0);
    RessourceItem acier = new RessourceItem("Acier","Alliage de fer et de carbone",2,0);//refinery
    RessourceItem carbone = new RessourceItem("Carbone","element essentiel de l'equipement de l'explorateur",3,0);
    RessourceItem copper = new RessourceItem("Cuivre","utile pour les cables electriques",4,0);
    RessourceItem lithium = new RessourceItem("Lithium","utilisé dans les batteries",5,0);
    RessourceItem batterie = new RessourceItem("Batterie","necessaire pour stocker de l'energie",6,0);//craft
    RessourceItem bauxite = new RessourceItem("Bauxite","element utilisé pour alliage d'aluminium",7,0);
    RessourceItem petrole = new RessourceItem("Petrole","donne du carburant s'il est raffiné",8,0);
    RessourceItem nickel = new RessourceItem("Nickel","element utilisé pour inoxyder des metaux",9,0);
    RessourceItem silver = new RessourceItem("Argent","element utilisé dans divers creation",10,0);
    RessourceItem silicium = new RessourceItem("Silicium","element utilisé dans les microprocesseur",11,0);
    RessourceItem gold = new RessourceItem("Or","utile pour ordinateur quantique",12,0);
    RessourceItem zinc = new RessourceItem("Zinc","utilisé dans plusieur alliage",13,0);
    RessourceItem cobalt = new RessourceItem("Cobalt","utilisé dans les pigments et divers alliage",14,0);
    RessourceItem uranium = new RessourceItem("Uranium","utile pour les reacteurs de vaisseau",15,0);
    //-----------------------------SpaceshipUpgrade---------------------------------------------
    SpaceshipUpgrade spaceshipupgrade1 = new SpaceshipUpgrade("ship2", "", 1, 0, 2);
    SpaceshipUpgrade spaceshipupgrade2 = new SpaceshipUpgrade("ship3", "", 1, 0, 3);
    SpaceshipUpgrade spaceshipupgrade3 = new SpaceshipUpgrade("ship4", "", 1, 0, 4);

    //--------------------------------------liste-----------------------------------------------
    private ConsumableItem[] liste_consommable={
      pomme,banane,carotte,pomme2terre,
            poire, tomate, laitue,datte, courgette,artichaut,
            salade1,salade2,viande1,viande2,viande3, artichaut2
    };

    private EquipmentItem[] liste_equipement={
            armure1,armure2,armure3,armure4,epee1,
            epee2,epee3,gun1,gun2,gun3,pioche,pioche2
    };

    private RessourceItem[] liste_ressource={
            iron, acier,carbone,copper,lithium,batterie, bauxite,
            petrole,nickel,silver,silicium,gold,zinc,cobalt,uranium
    };

    private SpaceshipUpgrade[] liste_spaceshipupgrade={
            spaceshipupgrade1, spaceshipupgrade2, spaceshipupgrade3
    };

    //------------------------------getter----------------------------------------
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ConsumableItem[] getListe_consommable(){
        return liste_consommable;
    }

    public EquipmentItem[] getListe_equipement(){
        return liste_equipement;
    }

    public RessourceItem[] getListe_ressource(){
        return liste_ressource;
    }

    public SpaceshipUpgrade[] getListe_spaceshipupgrade(){ return liste_spaceshipupgrade;}

    //--------------------------methode--------------------------------------------
    public void initItemRecipes(){
        //Initialisation des recettes

        //Upgrade spaceship to lvl 2
        ArrayList<Item> spaceshipupgrade1recipients = new ArrayList<Item>();
        Item recipient_01 = liste_ressource[0]; // iron
        Item recipient_02 = liste_ressource[3]; // copper
        Item recipient_03 = liste_ressource[11]; // gold
        Item recipient_04 = liste_ressource[7]; // petrole
        recipient_01.setQuantity(24);
        recipient_02.setQuantity(16);
        recipient_03.setQuantity(8);
        recipient_04.setQuantity(16);
        spaceshipupgrade1recipients.add(recipient_01);
        spaceshipupgrade1recipients.add(recipient_02);
        spaceshipupgrade1recipients.add(recipient_03);
        spaceshipupgrade1recipients.add(recipient_04);
        ItemRecipe spaceshipupgrade1recipe = new ItemRecipe(spaceshipupgrade1recipients,1);
        liste_spaceshipupgrade[0].setRecipe(spaceshipupgrade1recipe);

        //Upgrade spaceship to lvl 3
        ArrayList<Item> spaceshipupgrade2recipients = new ArrayList<Item>();
        SpaceshipUpgrade recipient_000 = liste_spaceshipupgrade[0];
        Item recipient_001 = liste_ressource[1]; // steel
        Item recipient_002 = liste_ressource[8]; //nickel
        Item recipient_003 = liste_ressource[6]; // bauxite
        Item recipient_004 = liste_ressource[7]; // petrole
        recipient_000.setQuantity(1);
        recipient_001.setQuantity(16);
        recipient_002.setQuantity(12);
        recipient_003.setQuantity(12);
        recipient_004.setQuantity(20);
        spaceshipupgrade2recipients.add(recipient_000);
        spaceshipupgrade2recipients.add(recipient_001);
        spaceshipupgrade2recipients.add(recipient_002);
        spaceshipupgrade2recipients.add(recipient_003);
        spaceshipupgrade2recipients.add(recipient_004);
        ItemRecipe spaceshipupgrade2recipe = new ItemRecipe(spaceshipupgrade2recipients,1);
        liste_spaceshipupgrade[1].setRecipe(spaceshipupgrade2recipe);

        //Upgrade spaceship to lvl 4
        ArrayList<Item> spaceshipupgrade3recipients = new ArrayList<Item>();
        SpaceshipUpgrade recipient_0 = liste_spaceshipupgrade[1];
        Item recipient_1 = liste_ressource[1]; // steel
        Item recipient_2 = liste_ressource[4]; //lithium
        Item recipient_3 = liste_ressource[14]; // uranium
        Item recipient_4 = liste_ressource[10]; // sicilium
        recipient_1.setQuantity(1);
        recipient_1.setQuantity(24);
        recipient_2.setQuantity(16);
        recipient_3.setQuantity(8);
        recipient_4.setQuantity(16);
        spaceshipupgrade3recipients.add(recipient_1);
        spaceshipupgrade3recipients.add(recipient_2);
        spaceshipupgrade3recipients.add(recipient_3);
        spaceshipupgrade3recipients.add(recipient_4);
        ItemRecipe spaceshipupgrade3recipe = new ItemRecipe(spaceshipupgrade3recipients,1);
        liste_spaceshipupgrade[2].setRecipe(spaceshipupgrade3recipe);

        //Recette pour salade1
        ArrayList<Item> salade1recipients = new ArrayList<Item>();
        Item recipient1 = liste_consommable[5]; // tomate
        Item recipient2 = liste_consommable[6]; // laitue
        recipient1.setQuantity(1);
        recipient2.setQuantity(1);
        salade1recipients.add(recipient1); salade1recipients.add(recipient2);
        ItemRecipe salade1recipe = new ItemRecipe(salade1recipients,1);
        liste_ressource[10].setRecipe(salade1recipe);

        // Recette pour Salade de pomme de terre
        ArrayList<Item> salade2recipients = new ArrayList<Item>();
        Item recipient3 = liste_consommable[6]; // Salade
        Item recipient03 = liste_consommable[5]; // Tomate
        Item recipient4 = liste_consommable[3]; // Pomme de terre
        recipient03.setQuantity(1);
        recipient3.setQuantity(2);
        recipient4.setQuantity(2);
        salade2recipients.add(recipient3);
        salade2recipients.add(recipient4);
        ItemRecipe salade2recipe = new ItemRecipe(salade2recipients, 1);
        liste_consommable[11].setRecipe(salade2recipe);

        // Recette pour Viande séchée
        ArrayList<Item> viandeSecheeRecipients = new ArrayList<Item>();
        Item recipient5 = liste_consommable[14]; // Viande cuite
        Item recipient6 = liste_ressource[2]; // Carbone
        recipient5.setQuantity(1);
        recipient6.setQuantity(1);
        viandeSecheeRecipients.add(recipient5);
        viandeSecheeRecipients.add(recipient6);
        ItemRecipe viandeSecheeRecipe = new ItemRecipe(viandeSecheeRecipients, 1);
        liste_consommable[13].setRecipe(viandeSecheeRecipe);

        // Recette pour Tenue d'explorateur lv2
        ArrayList<Item> tenueExplorateurLv2Recipients = new ArrayList<Item>();
        Item recipient7 = liste_equipement[0]; // Tenue d'explorateur
        Item recipient8 = liste_ressource[2]; // Carbone
        recipient7.setQuantity(1);
        recipient8.setQuantity(5);
        tenueExplorateurLv2Recipients.add(recipient7);
        tenueExplorateurLv2Recipients.add(recipient8);
        ItemRecipe tenueExplorateurLv2Recipe = new ItemRecipe(tenueExplorateurLv2Recipients, 1);
        liste_equipement[1].setRecipe(tenueExplorateurLv2Recipe);

        // Recette pour Blaster v2
        ArrayList<Item> blasterV2Recipients = new ArrayList<Item>();
        Item recipient9 = liste_equipement[7]; // Blaster v1
        Item recipient10 = liste_ressource[3]; // Cuivre
        Item recipient11 = liste_ressource[5]; // Batterie
        recipient9.setQuantity(1);
        recipient10.setQuantity(3);
        recipient11.setQuantity(2);
        blasterV2Recipients.add(recipient9);
        blasterV2Recipients.add(recipient10);
        blasterV2Recipients.add(recipient11);
        ItemRecipe blasterV2Recipe = new ItemRecipe(blasterV2Recipients, 1);
        liste_equipement[8].setRecipe(blasterV2Recipe);

        // Recette pour pioche2
        ArrayList<Item> pioche2Recipients = new ArrayList<Item>();
        Item recipient00 = liste_equipement[10]; //pioche
        Item recipient12 = liste_ressource[1]; // Acier
        Item recipient13 = liste_ressource[13]; // Cobalt
        recipient00.setQuantity(1);
        recipient12.setQuantity(4);
        recipient13.setQuantity(2);
        pioche2Recipients.add(recipient00);
        pioche2Recipients.add(recipient12);
        pioche2Recipients.add(recipient13);
        ItemRecipe pioche2Recipe = new ItemRecipe(pioche2Recipients, 1);
        liste_equipement[11].setRecipe(pioche2Recipe);

        // Recette pour Tenue astra-namekien
        ArrayList<Item> tenueAstraNamekienRecipients = new ArrayList<Item>();
        Item recipient14 = liste_equipement[2]; // Tenue d'explorateur-guerrier
        Item recipient15 = liste_ressource[4]; // Lithium
        Item recipient01 = liste_ressource[14]; // Uranium
        Item recipient02 = liste_ressource[11]; // Or
        recipient14.setQuantity(1);
        recipient15.setQuantity(8);
        recipient01.setQuantity(4);
        recipient02.setQuantity(6);
        tenueAstraNamekienRecipients.add(recipient14);
        tenueAstraNamekienRecipients.add(recipient15);
        tenueAstraNamekienRecipients.add(recipient01);
        tenueAstraNamekienRecipients.add(recipient02);
        ItemRecipe tenueAstraNamekienRecipe = new ItemRecipe(tenueAstraNamekienRecipients, 1);
        liste_equipement[3].setRecipe(tenueAstraNamekienRecipe);

        // Recette pour Astra vibro-lame
        ArrayList<Item> astraVibroLameRecipients = new ArrayList<Item>();
        Item recipient16 = liste_equipement[5]; // Longue vibro-lame
        Item recipient17 = liste_ressource[11]; // Or
        recipient16.setQuantity(1);
        recipient17.setQuantity(10);
        astraVibroLameRecipients.add(recipient16);
        astraVibroLameRecipients.add(recipient17);
        ItemRecipe astraVibroLameRecipe = new ItemRecipe(astraVibroLameRecipients, 1);
        liste_equipement[6].setRecipe(astraVibroLameRecipe);

        // Recette pour Viande cuite
        ArrayList<Item> viandeCuiteRecipients = new ArrayList<Item>();
        Item recipient18 = liste_consommable[12]; // Viande cru
        Item recipient19 = liste_ressource[2]; // Carbone
        recipient18.setQuantity(1);
        recipient19.setQuantity(1);
        viandeCuiteRecipients.add(recipient18);
        viandeCuiteRecipients.add(recipient19);
        ItemRecipe viandeCuiteRecipe = new ItemRecipe(viandeCuiteRecipients, 1);
        liste_consommable[14].setRecipe(viandeCuiteRecipe);

        // Recette pour Blaster astra
        ArrayList<Item> blasterAstraRecipients = new ArrayList<Item>();
        Item recipient22 = liste_equipement[8]; // Blaster v2
        Item recipient23 = liste_ressource[11]; // Or
        recipient22.setQuantity(1);
        recipient23.setQuantity(14);
        blasterAstraRecipients.add(recipient22);
        blasterAstraRecipients.add(recipient23);
        ItemRecipe blasterAstraRecipe = new ItemRecipe(blasterAstraRecipients, 1);
        liste_equipement[9].setRecipe(blasterAstraRecipe);

        // Recette pour Acier
        ArrayList<Item> steelRecipients = new ArrayList<Item>();
        Item recipient28 = liste_ressource[0]; // Fer
        Item recipient29 = liste_ressource[2]; // Carbone
        recipient28.setQuantity(2);
        recipient29.setQuantity(1);
        steelRecipients.add(recipient28);
        steelRecipients.add(recipient29);
        ItemRecipe steelRecipe = new ItemRecipe(steelRecipients, 1);
        liste_ressource[1].setRecipe(steelRecipe);

        //Recette pour batterie
        ArrayList<Item> batteryRecipients = new ArrayList<Item>();
        Item recipient30 = liste_ressource[4]; // Lithium
        Item recipient31 = liste_ressource[10]; // Silicium
        Item recipient32 = liste_ressource[11]; // Gold
        Item recipient33 = liste_ressource[3]; // Copper
        recipient30.setQuantity(6);
        recipient31.setQuantity(6);
        recipient32.setQuantity(4);
        recipient33.setQuantity(12);
        batteryRecipients.add(recipient30);
        batteryRecipients.add(recipient31);
        batteryRecipients.add(recipient32);
        batteryRecipients.add(recipient33);
        ItemRecipe batteryRecipe = new ItemRecipe(steelRecipients, 1);
        liste_ressource[5].setRecipe(batteryRecipe);


    }
    public <T extends Item> void initialiser(T[] c,Inventory i){//on initialise l'inventaire en y mettant les items
        for (T item : c){
            if (!i.getInventoryItem().contains(item)){
                i.addItem2List(item);
            }
        }
    }
}