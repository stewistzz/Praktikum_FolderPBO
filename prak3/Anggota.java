package prak3;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjam;
    private int jmlPinjam;

    // method
    public Anggota(String nomorKTP, String nama, int limitPinjam){
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
        this.jmlPinjam = 0;
    }

    // get nama
    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKTP(){
        return this.nomorKTP;
    }
    
    public void setKTP(String nomorKTP) {
        this.nomorKTP = nomorKTP;
    }
    public int getLimitPinjnam()
    {
        return this.limitPinjam;
    }

    public void setLimitPinjam(int jmlPinjam) {
        this.jmlPinjam = jmlPinjam;
    }

    public void pinjam (int nominal) {
        if (nominal < limitPinjam) {
            jmlPinjam += nominal;
        } else {
            System.out.println("Limit pinjam melebihi limit yang ditentukan");
        }
    }

    public int getJumlahPinjaman() {
        return jmlPinjam;
    }

    public void angsuran(int nominal) {
        if (nominal > 0 && nominal >= jmlPinjam * 0.1) {
            jmlPinjam -= nominal;
            System.out.println("Angsuran sebesar " + nominal + " berahasil");
        } else {
            System.out.println("Angsuran gagal. Nominal harus minimal 10% dari total pinjaman.");
        }
    }

    public int getJumlahAngsuran() {
        return jmlPinjam;
    }
}
