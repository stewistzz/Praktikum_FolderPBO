import java.time.LocalDate;

public class RumahSakitDemo {
    public static void main(String[] args) {
        // objek pegawai
        Pegawai ani = new Pegawai("1234", "dr. Ani");
        Pegawai bagus = new Pegawai("4567", "dr. Bagus");

        Pegawai desi = new Pegawai("1234", "Ns. Desi");
        Pegawai eka = new Pegawai("4567", "Ns. Eka");

        // object pasien 
        Pasien pasien1 = new Pasien("343298", "Puspa Widya");

        // memanggil method tambahKonsultasi yang mengambil arrayList
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        // cetak getInfo
        System.out.println(pasien1.getInfo());  

        // objek baru
        Pasien pasien2 = new Pasien("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}