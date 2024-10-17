package UTS_08_10_DImas.Soal3;

import java.util.Scanner;

public class DemoUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data untuk Customer
        System.out.println("=== Buat Profil Customer ===");
        System.out.print("User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();  // consume newline
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("Umur: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // consume newline
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Verification docs(jpg, png, pdf) : ");
        String verificationDocs = scanner.nextLine();

        // create object
        Customer customer = new Customer(userId, password, name, age, email);

        // edit profile
        // customer.edit_profile("Dimas", "000", 20, "dimasnugoroho@gmail.com");

        // login
        System.out.println();
        boolean loginSuccess = customer.log_in(userId, password);

        if (loginSuccess) {
            System.out.println();
            System.out.println("Selamat datang " + customer.get_name());
            customer.apply_verification(verificationDocs);
            
            System.out.println("ingin logout?(y/n) : ");
            String logout = scanner.nextLine();
            if (logout.equalsIgnoreCase("y")) {
                customer.log_out();
            } else {
                customer.show_documents();
            }

        } else {
            System.out.println("Login gagal");
            System.out.println("================\n");
        }

        System.out.println();

        // Admin 
        System.out.println("=== Admin ===");
        Admin admin = new Admin(1, "admin123", "Admin", 30, "admin@example.com");
        

        // Login sebagai Admin
        if (admin.log_in(1, "admin123")) {
            System.out.println("Selamat Datang " + admin.get_name());
            System.out.println();
            // Verifikasi customer berdasarkan userId
            admin.verifyUser(customer);
            
            // Update dan tambah kendaraan
            admin.update_vehicle_details(101);
            admin.addVehicle("Toyota Supra");
            System.out.println("==========================");

        } else {
            System.out.println("Admin login failed.");
            System.out.println("=============================");
        }
    }
}
