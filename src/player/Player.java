package player;

import inventory.Inventory;
import items.Item;

public class Player {
    public Inventory<Item> inventory;
    private int health = 1000;

    public Player() {
        this.inventory = new Inventory<>();
    }

    public boolean takeDamage(int damage) {
        if (this.health - damage < 0) {
            return true;
        } else {
            this.health -= damage;
        }
        return false;
    }

    public int getHealth() {
        return this.health;
    }
}