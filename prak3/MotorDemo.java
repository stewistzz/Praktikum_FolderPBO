package prak3;

public class MotorDemo {
    public static void main(String[] args) {
        // object motor
        // Motor motor1 = new Motor();
        // motor1.displayStatus();

        // motor1.platNomor = "B 0838 XZ";

        // // motor1.kecepatan = 50;
        // int kecepatanBaru = 50;
        // // mekanisme kondisi kecepatan
        // if (!motor1.isMesinOn && kecepatanBaru > 0) {
        //     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        // } else {
        //     motor1.kecepatan = kecepatanBaru;
        // }

        // motor1.displayStatus();

        // // objeck 2 dan 3
        // Motor motor2 = new Motor();
        // motor2.platNomor = "N 9840 AB";
        // motor2.isMesinOn = true;

        // // motor2.kecepatan = 40;
        // kecepatanBaru = 40;
        // // mekanisme kondisi kecepatan
        // if (!motor2.isMesinOn && kecepatanBaru > 0) {
        //     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        // } else {
        //     motor2.kecepatan = kecepatanBaru;
        // }

        // motor2.displayStatus();

        // Motor motor3 = new Motor();
        // motor3.platNomor = "D 8343 CV";

        // kecepatanBaru = 60;
        // // mekanisme kondisi kecepatan
        // if (!motor3.isMesinOn && kecepatanBaru > 0) {
        //     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        // } else {
        //     motor3.kecepatan = kecepatanBaru;
        // }

        // // motor3.kecepatan = 60;
        // motor3.displayStatus();

        // pembaruan dengan enkapsulasi
        Motor motor1 = new Motor();
        motor1.displayStatus();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(-10);
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();

    }
}
