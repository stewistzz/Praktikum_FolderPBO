package InterfaceLatihan;

public class SmartFridge extends Kulkas implements Audible {
    // atrinbut
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
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
        System.out.println("Volume: " + volume);
        turunkanVolume(10);
        System.out.println("volume " + volume);
    }
}
