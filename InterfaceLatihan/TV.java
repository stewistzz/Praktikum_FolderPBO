package InterfaceLatihan;

public class TV extends AlatElektronik implements Audible{
    //  atribut
    private String jenisLayar;
    private int volume;
    
    // const parent
    public TV(double harga, String warna, String merk, String jenisLayar, int volume) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setjenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    @Override
    public void naikkanVolume(int increment) {
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume -= decrement;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Jenis Layar: " + jenisLayar + "\nVolume: " + volume);
        naikkanVolume(10);
        System.out.println("volume " + volume);
    }
}
