package Tugas;

import java.time.LocalDate;
import java.util.ArrayList;

public class RentalPS {
    // atribut
    private int idRental;
    private String jenisPS;
    private int jumlah;
    private PegawaiRental pegawai;
    private LocalDate tanggalRental;

    public RentalPS(int idRental, String jenisPS, int jumlah, PegawaiRental pegawai, LocalDate tanggal) {
        this.idRental = idRental;
        this.jenisPS = jenisPS;
        this.jumlah = jumlah;
        this.pegawai = pegawai;
        this.tanggalRental = tanggal;
    }

    public int getRental() {
        return idRental;
    }

    public void setRental(int idRental) {
        this.idRental = idRental;
    }

    public PegawaiRental getPegawaiRental() {
        return pegawai;
    }

    public void setPegawaiRental(PegawaiRental pegawai) {
        this.pegawai = pegawai;
    }

    public String getJenisPS() {
        return jenisPS;
    }

    public void setJenisPS(String jenisPS) {
        this.jenisPS = jenisPS;
    }

    public int getJumlahRental() {
        return jumlah;
    }

    public void setJumlahRental(int jumlah) {
        this.jumlah = jumlah;
    }

    public LocalDate getTanggal() {
        return tanggalRental;
    }

    public void setTanggal(LocalDate tanggalRental) {
        this.tanggalRental = tanggalRental;
    }

    
    public String getInfo() {
        String info = "ID Rental: " + idRental + ", " +
        "Jenis PS: " + jenisPS + ", " +
        "Jumlah: " + jumlah + ", " +
        "Tanggal: " + tanggalRental + ", " +
        "Pegawai: " + pegawai.getInfo() + "\n";
        
        return info;
    }
}