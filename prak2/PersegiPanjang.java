package prak2;

public class PersegiPanjang {
    // atribut
    public int panjang;
    public int lebar;

    // method untuk menghitungLuas
    public int getLuas() 
    {
        return panjang * lebar;
    }

    // method untuk menghitung keliling
    public int getKeliling()
    {
        return 2 * (panjang + lebar);
    }

    // method untuk displayInfo
    public void displayInfo()
    {
        System.out.println("Data Persegi Panjang");
        System.out.println("Panjang\t\t: " + panjang);
        System.out.println("Lebar\t\t: " + lebar);
        System.out.println("Luas\t\t: " + getLuas());
        System.out.println("Keliling\t: " + getKeliling());
    }
}
