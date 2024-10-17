package Tugas_Copy;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String alamat;
    private String noHP;
    private int umur;
    private ArrayList<RentalPS> riwayatRentalPS;

    // constructor
    public Pelanggan(String nama, String alamat, String noHP, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.umur = umur;
        this.riwayatRentalPS = new ArrayList<RentalPS>();
    }

    // get san setter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setalAmat(String alamat) {
        this.alamat = alamat;
    }
    public String getNoHP() {
        return noHP;
    }
    public void setNoHp(String noHP) {
        this.noHP = noHP;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getInfo() {
        String info = "=============================== Data Rental ==============================\n";
        info += "Pelanggan Rental: \n";
        info += "Nama: " + this.nama + "\n";
        info += "Alamat: " + this.alamat + "\n";
        info += "Nomor Hp : " + this.noHP + "\n";
        info += "Umur: " + this.umur + "\n";
        info += "--------------------------------------------------------------------------\n";
        // mengembalikan info pasien
        if (!riwayatRentalPS.isEmpty()) {
            
            info += "Riwayat Rental : \n";
            for (RentalPS rental : riwayatRentalPS) {
                info += rental.getInfo() + "\n";
            }
        } else {
            info += "Belum ada riwayat Rental\n";
        }
        info += "==========================================================================\n";
        return info;
    }

    public void permintaanRental(LocalDate tanggalRental, int idRental, PS barangPS, int jumlah, PegawaiRental pegawai) {
        // object
        // RentalPS rental = new RentalPS(idRental, ps, jumlah, pegawai, tanggalRental);
        RentalPS rental = new RentalPS(idRental, barangPS, jumlah, pegawai, tanggalRental, barangPS);
       
        riwayatRentalPS.add(rental);
    }
}