package UTS_08_10_DImas.Soal3;

public class Customer extends User {

    
    // atribut
    private boolean verification_status;
    
    public Customer(int user_id, String password, String name, int age, String email_id) {
        super(user_id, password, name, age, email_id);
        this.verification_status = false;
    }

    // method   
    public boolean get_verification_status() {
        return verification_status;
    }

    public void apply_verification(String... doc) {
        // System.out.println("\n");
        for (String d : doc) {
            if (d.endsWith(".jpg") || d.endsWith(".png") || d.endsWith("pdf")) {
                verification_status = true;
                System.out.println("Verification apply sukses");
            } else {
                System.out.println("Verification apply gagal");
            }
        }
        System.out.println();
    }
}
