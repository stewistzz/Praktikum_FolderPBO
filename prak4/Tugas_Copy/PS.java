package Tugas_Copy;

public class PS {
    private String name;
    private String merek;

    PS(String name, String merek)
    {
        this.name = name;
        this.merek = merek;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public String getMerek() {
        return merek;
    }
    public void setMerek() {
        this.merek = merek;
    }

    public String getInfo()
    {
        String info = "";
        info += "Nama: " + this.name + "\n";
        info += "Merek: " + this.merek + "\n";
        return info;
    }
}
