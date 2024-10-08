package items.armour;

import items.Item;



public abstract class Armour extends Item {
    int durability;
    int defense;
    public boolean isDestroyed;

    public Armour( int durability, int defense) {
      super();
      this.durability = durability;
      this.defense = defense;
      this.isDestroyed = false;
    }

  public int getDefense() {
    return this.defense;
  }

    public boolean takeDamage(int damage) {
        if (this.durability - damage < 0) {
            return true;
        }
        this.durability -= damage;
        return false;
    }
}
