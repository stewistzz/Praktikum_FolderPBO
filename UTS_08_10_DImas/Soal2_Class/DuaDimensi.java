package UTS_08_10_DImas.Soal2_Class;

public class DuaDimensi extends Bangun {
    protected String namaBangun;
    protected int jumlahSisi;

    // cons
    public DuaDimensi(String jenisBangun, String namaBangun, int jumlahSisi) {
        super(jenisBangun);
        this.namaBangun = namaBangun;
        this.jumlahSisi = jumlahSisi;
    }

    public void deskripsiInfo() {
        super.deskripsiInfo();
        System.out.println("Nama Bangun\t\t: " + namaBangun);
        System.out.println("Jumlah Sisi\t\t: " + jumlahSisi);
    }
}
