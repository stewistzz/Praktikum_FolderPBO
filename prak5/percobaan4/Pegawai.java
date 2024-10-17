package prak5.percobaan4;

public class Pegawai {
    // atribut
    public String nip;
    public String nama;
    // private double gaji;
    protected double gaji;
    // public double gaji;


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
