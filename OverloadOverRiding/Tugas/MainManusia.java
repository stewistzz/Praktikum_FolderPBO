package OverloadOverRiding.Tugas;

public class MainManusia { 
    public static void main(String[] args) {
        // dynamic
        Manusia manusia = new Manusia();
        Manusia dos1 = new Dosen(); // disppatch
        Manusia mhs1 = new Mahasiswa(); // dispatch
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        // manusia
        System.out.println("\tManusia");
        manusia.bernafas();
        manusia.makan();
        System.out.println();

        System.out.println("\tDosen");
        dosen.lembur();
        dos1.makan();
        System.out.println();

        System.out.println("\tMahasiswa");
        mahasiswa.tidur();
        mhs1.makan();
        System.out.println();
    }
}