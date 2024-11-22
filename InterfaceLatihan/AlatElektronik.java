package InterfaceLatihan;

public class AlatElektronik {
    private double harga;
    private String warna;
    private String merk;

    // cons
    public AlatElektronik(double harga, String warna, String merk) {
        this.harga = harga;
        this.warna = warna;
        this.merk = merk;
    }

    // setter dan getter
    public double getHarga() {
        return harga;
    }

    public String getWarna() {
        return warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setHarga(String merk) {
        this.merk = merk;
    }


    public void getInfo() {
        System.out.println("Harga: " + harga + "\nWarna: " + warna + "\nMerk: " + merk);
    }
}
