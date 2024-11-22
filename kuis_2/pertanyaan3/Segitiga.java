package kuis_2.pertanyaan3;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public Segitiga(double alas, double tinggi, double sisiMiring) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    // override
    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    // override
    public double hitungKeliling() {
        return alas + tinggi + sisiMiring;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getSisiMiring() {
        return sisiMiring;
    }
}
