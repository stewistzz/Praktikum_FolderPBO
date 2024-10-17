package UTS_08_10_DImas.Soal2_Class;

public class PersegiPanjang extends DuaDimensi {
    private double panjang;
    private double lebar;

    // cons
    public PersegiPanjang(String jenisBangun, String namaBangun, int jumlahSisi, double panjang, double lebar) {
        super(jenisBangun, namaBangun, jumlahSisi);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public void deskripsiInfo() {
        super.deskripsiInfo();
        System.out.println("Panjang p panjang\t: " + panjang);
        System.out.println("Lebar p panjang\t\t: " + lebar);
        System.out.println("Luas p panjang\t\t: " + hitungLuas());
        System.out.println("Keliling p panjang\t: " + hitungKeliling());

        System.out.println();
    }

}
