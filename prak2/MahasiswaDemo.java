package prak2;

public class MahasiswaDemo {
    public static void main(String[] args) {
        // object mahasiswa 1
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        // panggil method cetakBIodata
        m1.displayBiodata();
        System.out.println();

        // object mahasiswa 2
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Rizky Kurniawan";
        m2.alamat = "Medan, Sumatera Utara";
        m2.kelas = "2B";
        // panggil method cetakBIodata
        m2.displayBiodata();
        System.out.println();

        // object mahasiswa 3
        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Anang Rusli";
        m3.alamat = "Jakarta, Jawa Barat";
        m3.kelas = "2C";
        // panggil method cetakBIodata
        m3.displayBiodata();
    }
}