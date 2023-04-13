package Kursus;

public class Peserta {
    private String nama;
    private int usia;
    private String alamat;
    private String pendidikan;

    public Peserta(String nama, int usia, String alamat, String pendidikan) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.pendidikan = pendidikan;
    }
    
    public String getNama() {
        return nama;
    }
    public int getUsia() {
        return usia;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getPendidikan() {
        return pendidikan;
    }


    

}
