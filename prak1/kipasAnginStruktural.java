package prak1;

public class kipasAnginStruktural {
    // method untuk menambahkan kecepatan kipas angin
    public static int tambahKecepatan(int kecepatan, int tambah) {
        return kecepatan += tambah;
    }

    // method untuk menambahkan kecepatan kipas angin
    public static int kurangiKecepatan(int kecepatan, int kurang) {
        return kecepatan -= kurang;
    }

    public static String kunciKipas(String k) {
        String status;
        if (k.equalsIgnoreCase("buka")) {
            status = "Kuncian kipas angin terbuka";
        } else {
            status = "Kuncian kipas angin tertutup";
        }
        return status;
    }

    public static void main(String[] args) {
        // atribut
        String merek, merek2, merek3, merek4, merek5, merek6, merek7, merek8,
                merek9, merek10;
        String kunci, kunci2, kunci3, kunci4, kunci5, kunci6, kunci7, kunci8, kunci9, kunci10;
        int kecepatan, kecepatan2, kecepatan3, kecepatan4, kecepatan5, kecepatan6, kecepatan7, kecepatan8, kecepatan9,
                kecepatan10;

        // objek1
        merek = "Maspion";
        kecepatan = 2;
        kunci = "buka";
        // objek2
        merek2 = "Cosmos";
        kecepatan2 = 0;
        kunci2 = "tutup";
        // objek3
        merek3 = "National";
        kecepatan3 = 3;
        kunci3 = "buka";
        // objek4
        merek4 = "Yundai";
        kecepatan4 = 1;
        kunci4 = "buka";
        // objek5
        merek5 = "Panasonic";
        kecepatan5 = 2;
        kunci5 = "tutup";
        // objek6
        merek6 = "Miyako";
        kecepatan6 = 1;
        kunci6 = "tutup";
        // objek7
        merek7 = "Sekai";
        kecepatan7 = 0;
        kunci7 = "tutup";
        // objek8
        merek8 = "Samsung";
        kecepatan8 = 2;
        kunci8 = "buka";
        // objek9
        merek9 = "Xiaomi";
        kecepatan9 = 1;
        kunci9 = "tutup";
        // objek10
        merek10 = "changhong";
        kecepatan10 = 3;
        kunci10 = "tutup";

        // panggil methid
        kecepatan = tambahKecepatan(kecepatan, 1);
        kunci = kunciKipas("tutup");

        kecepatan2 = tambahKecepatan(kecepatan2, 2);
        kunci2 = kunciKipas("buka");

        kecepatan3 = kurangiKecepatan(kecepatan3, 2);
        kunci3 = kunciKipas("tutup");

        kecepatan4 = tambahKecepatan(kecepatan4, 1);
        kunci4 = kunciKipas("buka");

        kecepatan5 = kurangiKecepatan(kecepatan5, 1);
        kunci5 = kunciKipas("buka");

        kecepatan6 = tambahKecepatan(kecepatan6, 3);
        kunci6 = kunciKipas("buka");

        kecepatan7 = tambahKecepatan(kecepatan7, 4);
        kunci7 = kunciKipas("tutup");

        kecepatan8 = tambahKecepatan(kecepatan8, 3);
        kunci8 = kunciKipas("tutup");

        kecepatan9 = tambahKecepatan(kecepatan9, 2);
        kunci9 = kunciKipas("buka");

        kecepatan10 = kurangiKecepatan(kecepatan10, 2);
        kunci10 = kunciKipas("buka");


        // print data
        System.out.println("Merek kipas-1" + " : " + merek);
        System.out.println("Kecepatan Kipas-1" + " : " + kecepatan);
        System.out.println("Status kunci kipas-1" + " : " + kunci);
        System.out.println();
        // print data
        System.out.println("Merek kipas-2" + " : " + merek2);
        System.out.println("Kecepatan Kipas-2" + " : " + kecepatan2);
        System.out.println("Status kunci kipas-2" + " : " + kunci2);
        System.out.println();
        // print data
        System.out.println("Merek kipas-3" + " : " + merek3);
        System.out.println("Kecepatan Kipas-3" + " : " + kecepatan3);
        System.out.println("Status kunci kipas-3" + " : " + kunci3);
        System.out.println();
        // print data
        System.out.println("Merek kipas-4" + " : " + merek4);
        System.out.println("Kecepatan Kipas-4" + " : " + kecepatan4);
        System.out.println("Status kunci kipas-4" + " : " + kunci4);
        System.out.println();
        // print data
        System.out.println("Merek kipas-5" + " : " + merek5);
        System.out.println("Kecepatan Kipas-5" + " : " + kecepatan5);
        System.out.println("Status kunci kipas-5" + " : " + kunci5);
        System.out.println();
        // print data
        System.out.println("Merek kipas-6" + " : " + merek6);
        System.out.println("Kecepatan Kipas-6" + " : " + kecepatan6);
        System.out.println("Status kunci kipas-6" + " : " + kunci6);
        System.out.println();
        // print data
        System.out.println("Merek kipas-7" + " : " + merek7);
        System.out.println("Kecepatan Kipas-7" + " : " + kecepatan7);
        System.out.println("Status kunci kipas-7" + " : " + kunci7);
        System.out.println();
        // print data
        System.out.println("Merek kipas-8" + " : " + merek8);
        System.out.println("Kecepatan Kipas-8" + " : " + kecepatan8);
        System.out.println("Status kunci kipas-8" + " : " + kunci8);
        System.out.println();
        // print data
        System.out.println("Merek kipas-9" + " : " + merek9);
        System.out.println("Kecepatan Kipas-9" + " : " + kecepatan9);
        System.out.println("Status kunci kipas-9" + " : " + kunci9);
        System.out.println();
        // print data
        System.out.println("Merek kipas-10" + " : " + merek10);
        System.out.println("Kecepatan Kipas-10" + " : " + kecepatan10);
        System.out.println("Status kunci kipas-10" + " : " + kunci10);
        System.out.println();
    }
}
