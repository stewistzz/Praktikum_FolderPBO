package kuis_2.pertanyaan1;

public class Player extends DamageAbleObject {
    int score;
    int livesRemaining;

    // Constructor
    public Player(String name, int posX, int posY, int maxHealth, int livesRemaining) {
        super(name, posX, posY, maxHealth);
        this.livesRemaining = livesRemaining;
        this.score = 0;
    }

    // Override onKilled method
    @Override
    public void onKilled() {
        livesRemaining--;
        System.out.println(name + " telah terbunuh! Kesempatan tersisa: " + livesRemaining);
        if (livesRemaining > 0) {
            setHealth(maxHealth); // Respawn kembali
            System.out.println(name + " respawns dengan nyawa penuh!");
        } else {
            System.out.println(name + " keluar dari permainan!");
        }
    }
    
}
