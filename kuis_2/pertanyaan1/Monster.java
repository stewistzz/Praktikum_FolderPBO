package kuis_2.pertanyaan1;

public class Monster extends DamageAbleObject {
    int threatLevel;
    String color;

    // Constructor
    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    // Override onKilled method
    @Override
    public void onKilled() {
        System.out.println(name + " telah terbunuh dan meninggalkan permainan.");
    }

    // makeNoise method monster
    public String makeNoise() {
        return name + " mengeluarkan suara untuk menyerang!";
    }
}
