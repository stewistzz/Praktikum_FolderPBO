package Tugas_Copy;

import java.time.LocalDate;
import java.util.ArrayList;

public class RentalPS {
    // atribut
    private int idRental;
    // private String jenisPS;
    private int jumlah;
    private PegawaiRental pegawai;
    private LocalDate tanggalRental;
    private PS barangPS;

    public RentalPS(int idRental, PS barangPs, int jumlah, PegawaiRental pegawai, LocalDate tanggal, PS barangPS) {
        this.idRental = idRental;
        this.barangPS = barangPS;
        this.jumlah = jumlah;
        this.pegawai = pegawai;
        this.barangPS = barangPS;
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

    public PS getJenisPS() {
        return barangPS;
    }

    public void setJenisPS(PS baraPs) {
        this.barangPS = barangPS;
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
        String info = "ID Rental: " + idRental + ", " + "Jumlah: " + jumlah + ", " + "Tanggal: " + tanggalRental + ", " + "Pegawai: " + pegawai.getInfo() + "\n" + "Barang: " + barangPS.getInfo(); 
        return info;
    }
}