package prak5.tugas;

public class ConsoleDevice {
    // atribut
    public String namaBrand;
    public String jenisConsole;
    public int nomorConsole;
    public int hargaConsole;

    // Constructor tanpa parameter
    public ConsoleDevice() {
        this.namaBrand = "Brand Kosong";
        this.jenisConsole = "Jenis Kosong";
        this.nomorConsole = 0;
        this.hargaConsole = 0;
    }

    // constructor method
    public ConsoleDevice(String namaBrand, String jenisConsole, int nomorConsole, int hargaConsole){
        this.namaBrand = namaBrand;
        this.jenisConsole = jenisConsole;
        this.nomorConsole = nomorConsole;
        this.hargaConsole = hargaConsole;
    }

    // cetak Info
    public void displayInfo(){
        System.out.println("Nama Brand\t: " + namaBrand);
        System.out.println("Jenis Console\t: " + jenisConsole);
        System.out.println("Nomor Console\t: " + nomorConsole);
        System.out.println("Harga Console\t: " + hargaConsole);
    }
    
}