public class TenagaKerja {
    private String bagian;
    private int jumlah_orang;
    private int gaji_perhari;
    private int harikerja_perbulan;
    private int gaji_perbulan;
    
    public TenagaKerja(String bagian, int jumlah_orang, int gaji_perhari, int harkerja_perbulan) {
        this.bagian = bagian;
        this.jumlah_orang = jumlah_orang;
        this.gaji_perhari = gaji_perhari;
        this.harikerja_perbulan = harkerja_perbulan;
        setGajiPerbulan();
    }

    public int getGajiPerbulan() {
        return gaji_perbulan;
    }

    public void setGajiPerbulan() {
        gaji_perbulan = gaji_perhari * harikerja_perbulan;
    }

    public int getHariKerjaPerbulan() {
        return harikerja_perbulan;
    }

    

}