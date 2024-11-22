package kuis_2.pertanyaan3;

class Lingkaran extends BangunDatar {
    private double radius;

    public Lingkaran(double radius) {
        super("Lingkaran");
        this.radius = radius;
    }

    // override
    public double hitungLuas() {
        return 3.14 * radius * radius;
    }

    // override
    public double hitungKeliling() {
        return 2 * 3.14 * radius;
    }

    public double getRadius() {
        return radius;
    }
}
