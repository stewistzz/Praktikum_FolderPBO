package prak3;

public class Motor {
    // atribut
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    // method
    public void displayStatus()
    {
        System.out.println("Plat Nomor : " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        } 
        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("==============================");
    }

    // method get enkapsulasi
    public String getPlatNomor()
    {
        return platNomor;
    }
    // method set enkapsulasi
    public void setPlatNomor(String platNomor)
    {
        this.platNomor = platNomor;
    }

    // method get enkapsulasi mesin on
    public boolean getIsMesinOn()
    {
        return isMesinOn;
    }
    // method set enkapsulasi mesin status
    public void setIsMesinOn(boolean isMesinOn)
    {
        this.isMesinOn = isMesinOn;
    }

    // method get enkapsulasi kecepatan
    public int getKecepatan()
    {
        return kecepatan;
    }
    // method set enkapsulasi
    public void setKecepatan(int kecepatan)
    {
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > 100 || kecepatan < 0) {
            System.out.println("Kecepatan motor tidak sesuai max-100 dan tidak boleh '-' ");
            this.kecepatan = 60;
        }  else {
            this.kecepatan = kecepatan;
        }
    }
}
