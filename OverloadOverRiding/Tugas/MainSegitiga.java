package OverloadOverRiding.Tugas;

public class MainSegitiga {
    public static void main(String[] args) {

        Segitiga sgt = new Segitiga();

        int sisiA = 9;
        int sisiB = 4;
        int sisiC = 16;

        System.out.println();
        System.out.print("Sudut 1 sisi : ");
        System.out.println(sgt.totalSudut(sisiA));
        System.out.println();
        System.out.print("Sudut 2 sisi : ");
        System.out.println(sgt.totalSudut(sisiA, sisiB));
        System.out.println();
        System.out.print("KelAiling 3 sisi : ");
        System.out.println(sgt.keliling(sisiA, sisiB, sisiC));
        System.out.println();
        System.out.print("Keliling 2 sisi : ");
        System.out.println(sgt.keliling(sisiA, sisiB));
        System.out.println();
    }
}
