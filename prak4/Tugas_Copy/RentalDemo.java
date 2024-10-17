package Tugas_Copy;

import java.time.LocalDate;
import java.util.Scanner;

public class RentalDemo {
    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);
        // objek pegawai rental
        PegawaiRental rizky = new PegawaiRental("001122","Rizky", "Pagi");
        PegawaiRental ahmad = new PegawaiRental("112233","Ahmad", "Siang");
        PegawaiRental andi = new PegawaiRental("223344","Andi", "Malam");

        // objek ps
        PS ps1 = new PS("PS-5", "Sony");
        PS ps2 = new PS("PS-4", "Sony");
        PS ps3 = new PS("X-BOX 360", "Xbox");

        // Objek pelanggan
        Pelanggan budi = new Pelanggan("Budi Prayogo", "Malang", "0812234542111", 19);
        Pelanggan sukma = new Pelanggan("Sukma Kinasih", "Malang", "0812234542155", 22);
        Pelanggan darsono = new Pelanggan("Sudarsono", "Malang", "0812234542887", 20);
        Pelanggan bambang = new Pelanggan("Bambang", "Malang", "0812234542887", 20);

        budi.permintaanRental(LocalDate.of(2024, 9, 10), 1, ps1, 1, andi);
        budi.permintaanRental(LocalDate.of(2024, 9, 11), 4, ps3, 1, ahmad);
        sukma.permintaanRental(LocalDate.of(2024, 9, 12), 2, ps2, 2, ahmad);
        darsono.permintaanRental(LocalDate.of(2024, 9, 10), 3, ps1, 1, rizky);

        System.out.println(budi.getInfo());
        System.out.println(sukma.getInfo());
        System.out.println(darsono.getInfo());
        System.out.println(bambang.getInfo());

        // dinamis object pelanggan
        boolean status = true;

        while (status) {
            System.out.println("============== Selamat Datang di RentalPS ================");
            System.out.println("1. ");
        }
    }
}
