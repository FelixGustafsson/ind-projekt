package items.weapon;

public class MagicBow extends Weapon {
    boolean hasFireMagic;
    boolean hasWaterMagic;
    boolean hasStoneMagic;

    public MagicBow(int durability, int damage, boolean stone, boolean water, boolean fire, String name) {
        super(durability, damage, name);
        this.hasFireMagic = fire;
        this.hasWaterMagic = water;
        this.hasStoneMagic = stone;
    }

    public int shootArrow() {
        if (this.isEquipped) {
            if (this.hasFireMagic) {
                return this.damage * 4;
            } else if (this.hasWaterMagic) {
                return this.damage * 3;
            } else if (this.hasStoneMagic) {
                return this.damage * 2;
            }
            return this.damage;
        } 
        return 0;   
    }
}