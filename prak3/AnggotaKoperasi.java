package prak3;

public class AnggotaKoperasi {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota\t: " + anggota1.getNama());
        System.out.println("Limit pinjaman\t: " + anggota1.getLimitPinjnam());

        System.out.println("\nMeminjam uang 10.000.000");
        anggota1.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini\t: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMeminjam uang 4.000.000");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini\t: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar Angsuran 1.000.000");
        anggota1.angsuran(1000000);
        System.out.println("Jumlah pinjaman saat ini\t: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar Angsuran 200.000");
        anggota1.angsuran(200000);
        System.out.println("Jumlah pinjaman saat ini\t: " + anggota1.getJumlahAngsuran());
    }
}
