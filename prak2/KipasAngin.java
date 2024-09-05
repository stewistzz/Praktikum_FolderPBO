package prak2;

public class KipasAngin {
    // atribut
    public String merek;
    public String warna;
    public boolean kunci;
    public int kecepatan;
    public int jumlahTombol;
    public String ukuran;

    // tambah kecepatan
    public int tambahKecepatan() {
        return kecepatan++;
    }

    // tambah kecepatan
    public int kurangiKecepatan() {
        return kecepatan--;
    }

    // mengunci Kipas
    public boolean mengunciKipas() {
        return kunci = true;
    }

    // menghidupkan kipas
    public void menghidupkanKipas() {
        System.out.println("==Status kipas telah hidup==");
    }

     // menghidupkan kipas
     public void mematikanKipas() {
        System.out.println("--Status kipas telah mati--");
        kecepatan = 0;
    }

    // display Info
    public void displayInfo() {
        System.out.println("Merek\t: " + merek);
        System.out.println("Warna\t: " + warna);
        System.out.println("Kunci\t: " + kunci);
        System.out.println("Kecepatan\t: " + kecepatan);
        System.out.println("Jumlah tombol\t: " + jumlahTombol);
        System.out.println("Ukuran\t: " + ukuran);
    }
}
