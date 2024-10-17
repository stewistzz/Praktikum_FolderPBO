package UTS_08_10_DImas.Soal2_Class;

import java.util.Scanner;


public class DemoBangun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===Pilih bangun yang ingin dihitung===");
            System.out.println("1. Segitiga Siku-Siku");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Keluar");
            System.out.println("=======================================");
            int pilihanBangun = scanner.nextInt();

            if (pilihanBangun == 3) {
                System.out.println("Terima kasih!");
                break;
            }

            if (pilihanBangun == 1) {
                System.out.print("Masukkan jumlah sisi: ");
                int jmlsisi = scanner.nextInt();
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();

                SegitigaSiku segitiga = new SegitigaSiku("2 Dimensi", "Segitiga Siku-Siku", jmlsisi, alas, tinggi);

                segitiga.hitungLuasSegitiga();
                segitiga.hitungKelilingSegitiga();
                segitiga.hitungSisiMiring();
                segitiga.deskripsiInfo();

            } else if (pilihanBangun == 2) {
                System.out.print("Masukkan jumlah sisi: ");
                int jmlsisi = scanner.nextInt();
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();

                PersegiPanjang persegiPanjang = new PersegiPanjang("2 Dimensi", "Persegi Panjang", jmlsisi, panjang, lebar);

                persegiPanjang.hitungLuas();
                persegiPanjang.hitungKeliling();
                persegiPanjang.deskripsiInfo();
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
