package Kursus;

public class Main {
    public static void main(String[] args) {
        Peserta p1 = new Peserta("a", 1, "a", "a");
        Peserta p2 = new Peserta("a", 2, "a", "a");
        Peserta p3 = new Peserta("a", 3, "a", "a");
        Peserta p4 = new Peserta("a", 4, "a", "a");

        Kursus k1 = new Kursus("q", 10, 100);
        Pendaftaran r1 = new Pendaftaran();

        k1.tambahPeserta(p1);
        k1.tambahPeserta(p2);
        k1.tambahPeserta(p3);
        r1.tambahPendaftaran(p1, k1);
        r1.tambahPendaftaran(p2, k1);
        r1.tambahPendaftaran(p3, k1);

        System.out.println(k1.hitungTotalPendaftaran());

    }
}
