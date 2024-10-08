package main;


import items.armour.BronzeHelmet;
import items.pet.DwarfOgre;
import items.weapon.MagicBow;
import monsters.GiantToad;
import player.Player;

public class Main {

public static void main(String[] args) {

        Player player = new Player();
        DwarfOgre dwarfOgre = new DwarfOgre(true, 150, 40);
        BronzeHelmet bronzeHelmet = new BronzeHelmet(200, 30);
        MagicBow magicBow = new MagicBow(130, 20, false, true, false, "Magisk stor pilbåge");
        GiantToad giantToad = new GiantToad(10, 200);
        String helmetEquippedMessage;

        player.inventory.addItem(dwarfOgre);
        player.inventory.addItem(bronzeHelmet);
        player.inventory.addItem(magicBow);

        System.out.println("Spelaren har följande föremål i sin väska:");
        player.inventory.getItems();
        System.out.println("Åh nej! Det kommer ett monster!");
        System.out.println("Monster: \n Attackskada: " + giantToad.getDamage() + "\n Hälsa: " + giantToad.getHealth());
        System.out.println("Spelaren attackerar med: " + magicBow.getName());
        
        giantToad.takeDamage(magicBow.shootArrow());
        
        System.out.println("Det gigantiska grodmonstret attackerar ");
        player.takeDamage(giantToad.getDamage());
        System.out.println("Som tur är har spelaren en bronshjälm som skyddar: " + bronzeHelmet.getDefense());
        if( bronzeHelmet.getIsEquipped()) { 
            helmetEquippedMessage = "Bronshjälmen är fortfarande i ryggsäcken";
        } else { 
            helmetEquippedMessage = "Bronshjälmen sitter som tur är på huvudet";
        }

        System.out.println("Åh nej! Har spelaren på sig sin hjälm? \n " + helmetEquippedMessage);
        System.out.println("Spelaren attackerat med sin husdjurs dvärgork");
        giantToad.takeDamage(dwarfOgre.use());

        System.out.println("Spelaren har nu följande häsla kvar: \n" + player.getHealth());
        System.out.println("Det gigantiska grodmonstret har nu följande hälsa kvar: \n" + giantToad.getHealth());

    }
}


