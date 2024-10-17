package UTS_08_10_DImas.Soal2_Class;

public class SegitigaSiku extends DuaDimensi {

    // atribut
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public SegitigaSiku(String jenisBangun, String namaBangun, int jumlahSisi, double alas, double tinggi) {
        super(jenisBangun, namaBangun, jumlahSisi);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = hitungSisiMiring();
    }

    // method
    public double hitungSisiMiring() {
        sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return sisiMiring;
    }

    public double hitungLuasSegitiga() {
        return (alas * tinggi) / 2;
    }

    public double hitungKelilingSegitiga() {
        return alas + tinggi + sisiMiring;
    }

    public void deskripsiInfo() {
        super.deskripsiInfo();
        System.out.println("Alas Segitiga\t\t: " + alas);
        System.out.println("Tinggi Segitiga\t\t: " + tinggi);
        System.out.println("Sisi Miring Segitiga\t: " + sisiMiring);
        System.out.println("Luas Segitiga\t\t: " + hitungLuasSegitiga());
        System.out.println("Keliling Segitiga\t: " + hitungKelilingSegitiga());

        System.out.println();
    }
    
}