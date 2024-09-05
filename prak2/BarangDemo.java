package prak2;

public class BarangDemo {
    public static void main(String[] args) {
        // object barang 1
        Barang barang1 = new Barang();
        barang1.kode = "ATK01";
        barang1.nama = "Bolpoin Pilot Hitam";
        barang1.hargaKotor = 3500;
        barang1.diskon = 0.1;
        // method display barang 1
        barang1.displayInfo();
    }
}
