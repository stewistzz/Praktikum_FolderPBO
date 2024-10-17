package UTS_08_10_DImas.Soal3;

public class Admin extends User {

    public Admin(int user_id, String password, String name, int age, String email_id) {
        super(user_id, password, name, age, email_id);
    }

    // method
    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Update id vehicle " + vehicle_id);
    }

    // Method untuk menambahkan kendaraan baru
    public Vehicle addVehicle(String vehicle) {
        Vehicle addNew = new Vehicle(vehicle);
        System.out.println("Vehicle " + vehicle + " added.");
        return addNew;
    }

    // Method untuk retrieve keluhan
    public void retrieveComplaint() {
        System.out.println("Complaint retrieved.");
    }

    // Method untuk memverifikasi pengguna
    public void verifyUser(Customer customer) {
        if (customer.get_verification_status()) {
            System.out.println("User with ID " + customer.get_User_Id() + " verified.");
        } else {
            System.out.println("User with ID " + customer.get_User_Id() + " not verified.");
        }
    }
}
