package kuis_2.pertanyaan3;

import java.util.ArrayList;
import java.util.List;

public class BangunDemo {
    public static void main(String[] args) {
        // Heterogeneous Collection
        List<BangunDatar> bangunList = new ArrayList<>();
        bangunList.add(new Persegi(4));
        bangunList.add(new Lingkaran(7));
        bangunList.add(new Segitiga(3, 4, 5));

        // Iterasi dan penggunaan polymorphism
        for (BangunDatar bangunDatar : bangunList) {
            System.out.println("=== Detail Bangun " + bangunDatar.getNama() + " ===");
            cetakBangunDatar(bangunDatar);
            System.out.println();
        }
    }
    // Polymorphic Method
    // arguments polymorphic
    public static void cetakBangunDatar(BangunDatar bangunDatar) {
        System.out.printf("Luas: " + "%.2f",bangunDatar.hitungLuas());
        System.out.println();
        System.out.printf("Keliling: " + "%.2f",bangunDatar.hitungKeliling());
        System.out.println();

        // instanceof check dan casting
        if (bangunDatar instanceof Persegi) {
            // Object casting down casting
            Persegi persegi = (Persegi) bangunDatar;
            System.out.println("Sisi Persegi: " + persegi.getSisi());
        } else if (bangunDatar instanceof Lingkaran) {
            // Object casting down casting
            Lingkaran lingkaran = (Lingkaran) bangunDatar;
            System.out.println("Radius Lingkaran: " + lingkaran.getRadius());
        } else if (bangunDatar instanceof Segitiga) {
            // Object casting down casting
            Segitiga segitiga = (Segitiga) bangunDatar;
            System.out.println("Alas Segitiga: " + segitiga.getAlas());
            System.out.println("Tinggi Segitiga: " + segitiga.getTinggi());
            System.out.println("Sisi Miring Segitiga: " + segitiga.getSisiMiring());
        }
    }

    
}
