package monsters;


public abstract class Monster {
    int health;
    protected int damage;
    

    public Monster( int health, int damage) {
      this.health = health;
      this.damage = damage;
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
    public int getDamage() {
        return this.damage;
    }

    
}
