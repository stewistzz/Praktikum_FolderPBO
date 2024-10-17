package prak5.percobaan5;

public class Dosen extends Pegawai {
    // add atribut
    public String nidn;
    

    // constructor
    public Dosen()
    {
        System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }

    // INFO
    // public String getAllInfo () {
    //     String info = "";
    //     info += "NIP : " + nip + "\n";
    //     info += "Nama : " + nama + "\n";
    //     info += "Gaji : " + gaji + "\n";
    //     info += "NIDN : " + nidn + "\n";
        
    //     return info;
    // }

    // INFO
    // public String getAllInfo () {
    //     String info = "";
    //     info += "NIP : " + this.nip + "\n";
    //     info += "Nama : " + this.nama + "\n";
    //     info += "Gaji : " + this.gaji + "\n";
    //     info += "NIDN : " + this.nidn + "\n";
        
    //     return info;
    // }
    
    // INFO
    // public String getAllInfo () {
    //     String info = "";
    //     info += "NIP : " + super.nip + "\n";
    //     info += "Nama : " + super.nama + "\n";
    //     info += "Gaji : " + super.gaji + "\n";
    //     info += "NIDN : " + super.nidn + "\n";
        
    //     return info;
    // }

    // INFO
    // public String getAllInfo () {
    //     String info = "";
    //     info += "NIP : " + super.nip + "\n";
    //     info += "Nama : " + super.nama + "\n";
    //     info += "Gaji : " + super.gaji + "\n";
    //     info += "NIDN : " + this.nidn + "\n";
        
    //     return info;
    // }

    // praktikum 5
    // INFO
    // public String getAllInfo () {
    //     String info = getInfo();
    //     info += "NIDN : " + nidn + "\n";
        
    //     return info;
    // }

    // INFO
    // public String getAllInfo () {
    //     String info = this.getInfo();
    //     info += "NIDN : " + nidn + "\n";
        
    //     return info;
    // }

    public String getInfo() {
        return "NIDN : " + this.nidn + "\n";
    }
    // INFO
    public String getAllInfo () {
        String info = super.getInfo();
        info += this.getInfo();
        
        return info;
    }
}
