package InterfaceLatihan;

public class Main {
    public static void main(String[] args) {
        
        Kipas kipas = new Kipas(50000, "Putih", "Maspion", "Kipas Angin");
        Kulkas kulkas = new Kulkas(2, 2000000, "Perak", "Panasonic");
        SmartFridge smartFridge = new SmartFridge(300, 3, 3500000, "Hitam", "Panasonic");
        TV tv = new TV(4000000, "Merah", "LG", "LCD", 15);

        System.out.println("Info Kipas:");
        kipas.getInfo();
        System.out.println("\nInfo Kulkas:");
        kulkas.getInfo();
        System.out.println("\nInfo Smart Fridge:");
        smartFridge.getInfo();
        System.out.println("\nInfo TV:");
        tv.getInfo();

    }
}
