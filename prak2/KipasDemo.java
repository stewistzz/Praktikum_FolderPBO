package prak2;

public class KipasDemo {
    public static void main(String[] args) {
        KipasAngin k1 = new KipasAngin();
        k1.merek = "Maspion";
        k1.warna = "Biru";
        k1.kunci = false;
        k1.kecepatan = 1;
        k1.jumlahTombol = 3;
        k1.ukuran = "Sedang";

        k1.menghidupkanKipas();
        k1.displayInfo();
        System.out.println();

        k1.menghidupkanKipas();
        k1.tambahKecepatan();
        k1.displayInfo();

        System.out.println();

        k1.mematikanKipas();
        k1.displayInfo();


        System.out.println("=========================");

        // object 2
        KipasAngin k2 = new KipasAngin();
        k2.merek = "Cosmos";
        k2.warna = "Putih";
        k2.kunci = false;
        k2.kecepatan = 2;
        k2.jumlahTombol = 4;
        k2.ukuran = "besar";
        k2.menghidupkanKipas();
        k2.displayInfo();
        System.out.println();
        k2.menghidupkanKipas();
        k2. kurangiKecepatan();
        k2.mengunciKipas();
        k2.displayInfo();
    }
}
