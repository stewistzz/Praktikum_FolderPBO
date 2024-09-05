package prak2;

public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang();

        p1.panjang = 5;
        p1.lebar = 3;
        p1.getLuas();
        p1.getKeliling();
        p1.displayInfo();
    }
}
