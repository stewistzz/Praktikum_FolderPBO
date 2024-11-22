package InterfaceLatihan;

public class Kipas extends AlatElektronik {
    // atribut
    private String jenis;

    // constructor parent
    public Kipas(double harga, String warna, String merk, String jenis) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    // method
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Jenis Kipas: " + jenis);
    }
}
