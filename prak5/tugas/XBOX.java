package prak5.tugas;

public class XBOX extends ConsoleDevice{

    // atribut
    public String seriXbox;

    // Constructor tanpa parameter
    public XBOX() {
        super();
        this.seriXbox = "Seri Kosong";
    }

    // method constructor
    public XBOX(String namaBrand, String jenisConsole, int nomorConsole, int hargaConsole, String seriXbox) {
        super(namaBrand, jenisConsole, nomorConsole, hargaConsole);
        this.seriXbox = seriXbox;
    }

    // info
    public void displayXbox() {
        System.out.println("Nama Brand\t: " + namaBrand);
        System.out.println("Jenis Console\t: " + jenisConsole);
        System.out.println("Nomor Console\t: " + nomorConsole);
        System.out.println("Harga Console\t: " + hargaConsole);
        System.out.println("Seri Console\t: " + seriXbox);
    }
}
