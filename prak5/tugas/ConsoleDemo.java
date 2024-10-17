package prak5.tugas;

public class ConsoleDemo extends ConsoleDevice{
    public static void main(String[] args) {
        // Membuat objek dari subcl ss XBOX
        XBOX xboxConsole = new XBOX("XBOX", "XBOX", 1, 80000, "Series S");
        xboxConsole.displayXbox();

        System.out.println();

        // Membuat objek dari subclass Playstation
        PlayStation psConsole = new PlayStation("Sony", "Play Station", 2, 90000, "PS-5", "Slim");
        psConsole.displayPS();
    }
}
