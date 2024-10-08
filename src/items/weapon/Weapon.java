package items.weapon;

import items.Equippable;
import items.Item;



public abstract class Weapon extends Item implements Equippable {
    String name;
    protected int damage;
    int durability;
    protected boolean isEquipped;

    public Weapon(int damage, int durability, String name) {
        super();
        this.damage = damage;
        this.durability = durability;
        this.name = name;
    }

    public boolean takeDamage(int damage) {
        if (this.durability - damage < 0) {
            return true;
        }
        this.durability -= damage;
        return false;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void equip() {
        this.isEquipped = true;
    }

    @Override
    public void unEquip() {
        this.isEquipped = false;
    }

    
}