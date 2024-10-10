package inventory;

import items.armour.BronzeHelmet;
import items.pet.DwarfOgre;
import items.weapon.MagicBow;
import java.util.ArrayList;
import java.util.List;

public class Inventory<Item>  {
    public List<Item> items = new ArrayList<>();

    public Inventory() {
        this.items = new ArrayList();
    }

    public void addItem(Item item) {  
        items.add(item);
        
    }

    public void getItems() {  
        this.items.forEach((item) -> {
            if (item instanceof MagicBow) {
            System.out.println("- Magisk båge");
            }
            if (item instanceof BronzeHelmet) {
            System.out.println("- Bronshjälm");
            }
            if (item instanceof DwarfOgre) {
            System.out.println("- Dvärgork (husdjur)");
            }
        });
        
    }

    public void removeItem(Item item) {
        this.items.removeIf(x -> x.equals(item));
    }

}