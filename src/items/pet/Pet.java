package items.pet;

import items.Item;

public abstract class Pet extends Item {
    protected int damage;
    protected int health;

    public Pet(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }

    public boolean takeDamage(int damage) {
        if (this.health - damage < 0) {
            return true;
        }
        this.health -= damage;
        return false;
    }
}