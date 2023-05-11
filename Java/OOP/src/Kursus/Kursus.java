package Kursus;

import java.util.ArrayList;

public class Kursus {
    private String nama_kursus;
    private int jumlah_sesi;
    private int biaya;
    private ArrayList<Peserta> daftar_peserta = new ArrayList<Peserta>() ;

    public Kursus(String nama_kursus, int jumlah_sesi, int biaya) {
        this.nama_kursus = nama_kursus;
        this.jumlah_sesi = jumlah_sesi;
        this.biaya = biaya;
    }

    public String getNamaKursus() {
        return nama_kursus;
    }
    public int getJumlahSesi() {
        return jumlah_sesi;
    }
    public int getBiaya() {
        return biaya;
    }
    public ArrayList<Peserta> getDaftarPeserta() {
        return daftar_peserta;
    }

    public void tambahPeserta(Peserta peserta) {
        daftar_peserta.add(peserta);   
    }
    public int hitungTotalPendaftaran() {
        return jumlah_sesi * biaya * daftar_peserta.size();
    }


}
