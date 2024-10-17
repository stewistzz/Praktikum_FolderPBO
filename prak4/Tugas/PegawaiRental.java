package Tugas;

public class PegawaiRental {
    // atribut
    private String nomorPegawai;
    private String nama;
    private String shift;

    // constructor
    public PegawaiRental(String nomorPegawai, String nama, String shift) {
        this.nomorPegawai = nomorPegawai;
        this.nama = nama;
        this.shift = shift;
    }
    // setter dan getter
    public String getNomorPegawai() {
        return nomorPegawai;
    }
    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }
    // get info
    public String getInfo() {
        return nama + " (" + nomorPegawai + " / " + shift + ") ";
    }
}
