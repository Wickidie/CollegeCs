package Kursus;

public class Pendaftaran {
    private int no_pendaftaran;
    private String tanggal_daftar;
    private Peserta peserta;
    private Kursus kursus;

    public int getNoPendaftaran() {
        return no_pendaftaran;
    }
    public String getTanggalDaftar() {
        return tanggal_daftar;
    }
    public Peserta getPeserta() {
        return peserta;
    }
    public Kursus getKursus() {
        return kursus;
    }

    public void tambahPendaftaran(Peserta peserta, Kursus kursus) {
        this.peserta = peserta;
        this.kursus = kursus;
    }

}
