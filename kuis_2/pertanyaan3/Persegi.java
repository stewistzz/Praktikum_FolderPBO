package kuis_2.pertanyaan3;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }

    // override
    public double hitungLuas() {
        return sisi * sisi;
    }

    // override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double getSisi() {
        return sisi;
    }
}
