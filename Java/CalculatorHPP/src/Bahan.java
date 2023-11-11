public class Bahan {
    private String keterangan;
    private String satuan;
    private int harga;
    private int isi;
    private int harga_satuan;
    private int bahan_pokok;
    private int sekali_produksi;
    
    public Bahan(String keterangan, String satuan, int harga, int isi) {
        this.keterangan = keterangan;
        this.satuan = satuan;
        this.harga = harga;
        this.isi = isi;
        setHargaSatuan();
    }

    public int getHargaSatuan() {
        return harga_satuan;
    }

    public void setHargaSatuan() {
        harga_satuan = harga / isi;
    }

    public void setSekaliProduksi(int sekali_produksi) {
        this.sekali_produksi = sekali_produksi;
    }
}
