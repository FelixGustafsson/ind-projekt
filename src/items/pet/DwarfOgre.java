package items.pet;

import items.pet.Pet;
import items.Useable;

public class DwarfOgre extends Pet implements Useable {
    boolean hasRage;

    public DwarfOgre(boolean hasRage, int health, int damage) {
        super(damage, health);
        this.hasRage = hasRage;
    }

    private int rageAttack() {
        return this.damage;
    }

    public int use() {
        return this.rageAttack();   
     }
}