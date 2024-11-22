package kuis_2.pertanyaan1;

public record GameDemo() {
    public static void main(String[] args) {
        // objek player
        Player player = new Player("Hero", 0, 0, 100, 2);
        // objek Monster
        Monster monster = new Monster("Goblin", 5, 10, 50, 2, "Green");

        System.out.println("==================Game Start==================");
        System.out.println("| " + player.name + " Memulai permainan, status nyawa " + player.getHealth() + " health.\t|");
        System.out.println("----------------------------------------------");
        System.out.println("| "+monster.name + " Monster muncul, status nyawa " + monster.getHealth() + " health.\t|");
        System.out.println("==============================================");
        
        System.out.println(monster.makeNoise());

        monster.takeDamage(30);
        monster.takeDamage(25);
        System.out.println();
        player.takeDamage(50);
        player.takeDamage(60);
        player.takeDamage(120);
    }
}
