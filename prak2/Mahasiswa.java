package prak2;

class Mahasiswa {
    public String nim;
    public String nama;
    public String alamat;
    public String kelas;

    // method untuk mencetak biodata
    public void displayBiodata() 
    {
        System.out.println("NIM\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Alamat\t: " + alamat);
        System.out.println("NIM \t: " + kelas);
    }
}