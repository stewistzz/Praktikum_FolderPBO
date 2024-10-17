package OverloadOverRiding.Tugas;

/**
 * Segitiga
 */
public class Segitiga {
    // atribut
    private int sudut;

    public int getSudut() {
        return sudut;
    }

    public void setSudut(int sudut) {
        this.sudut = sudut;
    }
    
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2)) + Math.sqrt(Math.pow(sisiB, 2));
    }
}