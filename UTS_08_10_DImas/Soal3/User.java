package UTS_08_10_DImas.Soal3;

public class User extends UserProfile{
    // cons
    public User(int user_id, String password, String name, int age, String email_id) {
        super(user_id, password, name, age, email_id);
    }

    // method
    public boolean log_in(int inputUserId, String inputUserPass) {
        if (get_User_Id() == inputUserId && get_password().equals(inputUserPass)) {
            System.out.println("Login User Berhasil");
            // System.out.println("Selamat Datang " + get_name());
            return true;
        } else {
            System.out.println("Login User Gagal");
            return false; 
        }
    }

    public void recover_password() {
        System.out.println("Login gagal. Apakah Anda ingin memulihkan kata sandi?");
        System.out.println("Password Anda adalah: " + get_password());
        System.out.println("Recovery link sent to email: " + this.get_email());
    }

    public void log_out() {
        System.out.println();
        System.out.println("======Log_out berhasil======");
    }
}
