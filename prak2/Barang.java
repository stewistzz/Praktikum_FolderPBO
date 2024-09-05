package prak2;

public class Barang {
    // atribut dari barang
    public String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;

    // method menghitung dan mengembalikan nilai harga bersih
    public double getHargaBersih() 
    {
        return hargaKotor - diskon * hargaKotor;
    }

    // method mencetak indo dari sebuah barang
    public void displayInfo()
    {
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Harga kotor\t: " + hargaKotor);
        System.out.println("Diskon\t\t: " + diskon);
        System.out.println("Harga bersih\t: " + getHargaBersih());
    }
}
