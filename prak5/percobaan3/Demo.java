package prak5.percobaan3;

import prak5.inheritance.Dosen;

public class Demo {
    public static void main(String[] args) {
        // create object doesn
        Dosen dosen1 = new Dosen();

        dosen1.nama = "Yansy Ayuningtyas";
        dosen1.nip = "34439837";
        dosen1.gaji = 3000000;
        dosen1.nidn = "1989432439";

        System.out.println(dosen1.getInfo());
    }
}
