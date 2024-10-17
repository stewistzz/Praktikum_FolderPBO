package Tugas;

import java.time.LocalDate;

public class RentalDemo {
    public static void main(String[] args) {
        // objek pegawai rental
        PegawaiRental rizky = new PegawaiRental("001122","Rizky", "Pagi");
        PegawaiRental ahmad = new PegawaiRental("112233","Ahmad", "Siang");
        PegawaiRental andi = new PegawaiRental("223344","Andi", "Malam");

        // Objek pelanggan
        Pelanggan budi = new Pelanggan("Budi Prayogo", "Malang", "0812234542111", 19);
        Pelanggan sukma = new Pelanggan("Sukma Kinasih", "Malang", "0812234542155", 22);
        Pelanggan darsono = new Pelanggan("Sudarsono", "Malang", "0812234542887", 20);
        Pelanggan bambang = new Pelanggan("Bambang", "Malang", "0812234542887", 20);

        budi.permintaanRental(LocalDate.of(2024, 9, 10), 1, "PS 5", 1, andi);
        budi.permintaanRental(LocalDate.of(2024, 9, 11), 4, "PS 4", 1, ahmad);
        sukma.permintaanRental(LocalDate.of(2024, 9, 12), 2, "PS 4", 2, ahmad);
        darsono.permintaanRental(LocalDate.of(2024, 9, 10), 3, "PS 5", 1, rizky);

        System.out.println(budi.getInfo());
        System.out.println(sukma.getInfo());
        System.out.println(darsono.getInfo());
        System.out.println(bambang.getInfo());
    }
}
