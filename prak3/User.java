package prak3;

public class User {
    private String username;
    private String nama;
    private String email;
    private String alamat;
    private String pekerjaan;

    // constructor
    public User(String username, String nama, String email, String alamat, String pekerjaan){
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

    public void cetakInfo() {
        System.out.println("Username\t: " + username);
        System.out.println("Nama\t\t:  " + nama);
        System.out.println("Email\t\t:  " + email);
        System.out.println("ALamat\t\t:  " + alamat);
        System.out.println("Pekerjaan\t:  " + pekerjaan);

    }
}
