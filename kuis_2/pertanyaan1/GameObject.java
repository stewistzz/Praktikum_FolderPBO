package kuis_2.pertanyaan1;

public class GameObject {
    // atribut
    public String name;
    public int posX, posY;

    // constructor parent
    public GameObject(String name, int posX, int posY) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    // method despawn(menghilang)
    public void despawn() {
        System.out.println(name + " telah meninggalkan permainan.");
    }
}
