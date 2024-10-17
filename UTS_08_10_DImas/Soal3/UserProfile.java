package UTS_08_10_DImas.Soal3;

public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc[] = {".jpg", ".png", ".pdf"};

    // cons
    public UserProfile(int user_id, String password, String name, int age, String email_id) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
    }

    // method
    public int get_User_Id() {
        return user_id;
    }

    public String get_password(){
        return password;
    }

    public String get_name() {
        return name;
    }
    
    public int get_age() {
        return age;
    }

    public String get_email() {
        return email_id;
    }

    public void edit_profile(String name, String password, int age, String email_id) {
        System.out.println("Edit Profile");
        this.name = name;
        this.password = password;
        this.age = age;
        this.email_id = email_id;

    }

    public void edit_profile(int editUserId, int editAge, String editPassword, String editName, String editEmailId){
        this.user_id = editUserId;
        this.age = editAge;
        this.password = editPassword;
        this.name = editName;
        this.email_id = editEmailId;
    }

    public void show_documents() {
        System.out.println("User ID\t\t: " + user_id);
        // System.out.println("Password\t: " + password);
        System.out.println("E-mail\t\t: " + email_id);
        System.out.println("Nama\t\t: " + name);
        System.out.println("Umur\t\t: " + age);

        System.out.print("Tipe Docs\t: ");
        for (String tipeDocs : doc) {
            System.out.print(tipeDocs + " ");
        }
        
        System.out.println();
    }
}
