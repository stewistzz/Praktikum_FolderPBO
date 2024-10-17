package UTS_08_10_DImas.Soal2_Class;

public class Bangun {
    protected  String jenisBangun;

    // method
    public Bangun(String jb) {
        jenisBangun = jb;
    }

    public void deskripsiInfo() {
        System.out.println("Jenis Bangun\t\t: " + jenisBangun);
    }

}
