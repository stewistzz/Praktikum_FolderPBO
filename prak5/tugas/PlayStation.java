package prak5.tugas;

public class PlayStation extends ConsoleDevice {
    // atribut
    public String jenisPS;
    public String tipePS;

    // constructor tanpa parameter
    // Constructor tanpa parameter
    public PlayStation() {
        super();
        this.jenisPS = "Jenis Kosong";
        this.tipePS = "Tipe Kosong";
    }
    // method constructor
    public PlayStation(String namaBrand, String jenisConsole, int nomorConsole, int hargaConsole, String jenisPS, String tipePS) {
        super(namaBrand, jenisConsole, nomorConsole, hargaConsole); 
        this.jenisPS = jenisPS;
        this.tipePS = tipePS;
    }

    // info
    public void displayPS() {
        System.out.println("Nama Brand\t: " + namaBrand);
        System.out.println("Jenis Console\t: " + jenisConsole);
        System.out.println("Nomor Console\t: " + nomorConsole);
        System.out.println("Harga Console\t: " + hargaConsole);
        System.out.println("Jenis Console\t: " + jenisPS);
        System.out.println("Tipe Console\t: " + tipePS);
    }

}
