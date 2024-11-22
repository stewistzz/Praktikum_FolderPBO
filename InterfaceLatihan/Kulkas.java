package InterfaceLatihan;

public class Kulkas extends AlatElektronik {
    // atribut
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    // method
    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
    
}
