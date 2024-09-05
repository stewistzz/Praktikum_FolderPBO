package prak1;

import java.util.Scanner;

class kalkulatorStruktural {

    // method
    public static int hitung(int angka1, char op, int angka2) {
        int result = 0;
        switch (op) {
            case '+':
                result = angka1 + angka2;
            break;
            case '-':
                result = angka1 - angka2;
            break;
            case '*':
                result = angka1 * angka2;
            break;
            case '/':
                result = angka1 / angka2;
            break;
            case '%':
                result = angka1 % angka2;
            break;
            default:
                System.out.println("");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int berhitung, angka1, angka2;
        char op;

        System.out.println("Kalkulator berhitung sederhana");
        System.out.println("===================================");
        
            System.out.print("Masukkan angka pertama : ");
            angka1 = input.nextInt();
            // System.out.println();
            System.out.print("Masukkan angka kedua : ");
            angka2 = input.nextInt();
            // System.out.println();
            System.out.print("Masukkan operator hitung : ");
            op = input.next().charAt(0);
            // System.out.println();
            berhitung = hitung(angka1, op, angka2);
            System.out.println("============================");
            System.out.println("Hasil Perhitungan : " + berhitung);
            System.out.println();
    }
}