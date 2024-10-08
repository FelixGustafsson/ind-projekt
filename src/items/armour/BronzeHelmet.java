package items.armour;

import items.armour.Armour;
import items.Equippable;

public class BronzeHelmet extends Armour implements Equippable {
    boolean isEquipped;


    public BronzeHelmet(int durability, int defense) {
        super(durability, defense);
        this.isEquipped = false;
    }

    @Override
    public void equip() {
        this.isEquipped = true;
    }

    @Override
    public void unEquip() {
        this.isEquipped = false;
    }

    public boolean getIsEquipped() {
        return this.isEquipped;
    }
}