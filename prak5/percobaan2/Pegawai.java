package prak5.percobaan2;

public class Pegawai {
    // atribut
    public String nip;
    public String nama;
    public double gaji;

    // cons
    public Pegawai() {
        System.out.println("Objek dari class Pegawai dibuat");
    }

    // get info
    public String getInfo() {
        String info = "";
        info += "NIP : " + nip + "\n";
        info += "Nama : " + nama + "\n";
        info += "Gaji : " + gaji + "\n";

        return info;
    }
}
