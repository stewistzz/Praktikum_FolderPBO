package kuis_2.pertanyaan3;

public abstract class BangunDatar {
    protected String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }
    public abstract double hitungLuas();

    public abstract double hitungKeliling();
    
    public String getNama() {
        return nama;
    }
}
