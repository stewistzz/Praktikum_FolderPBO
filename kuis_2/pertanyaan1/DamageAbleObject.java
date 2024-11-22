package kuis_2.pertanyaan1;

public abstract class DamageAbleObject extends GameObject {
    // atribut
    public int maxHealth;
    private int health; 

    // Constructor
    public DamageAbleObject(String name, int posX, int posY, int maxHealth) {
        super(name, posX, posY);
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    // getter dan setter
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }

    // method isDead
    public boolean isDead() {
        return health <= 0;
    }

    // Take damage method
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " takes " + damage + " damage. Remaining health: " + health);
        if (isDead()) {
            onKilled();
        }
    }
    // abstract method
    public abstract void onKilled();
}
