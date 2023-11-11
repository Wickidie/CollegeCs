import java.util.ArrayList;
import java.lang.Math;

public class Produk {
    private String produk;
    private String satuan;
    private String kemasan;
    private int berat_produk;
    private ArrayList<Bahan> daftar_bahan;
    private ArrayList<TenagaKerja> daftar_tenaga_kerja;
    private int output_produksi_perhari;
    private int total_sekali_produksi;
    private int total_biaya_tenagakerja;
    public int total_biaya_bahanbaku;
    public int biaya_TKL;
    public int harga_pokok_produksi;
    private double margin[] = new double[3];
    private double jual[] = new double[3];
    private String customer[] = {"Distributor", "Reseller", "EndUser"};
    
    Produk(String produk, String satuan, String kemasan, int berat_produk, int total_sekali_produksi){
        this.produk = produk;
        this.satuan = satuan;
        this.kemasan = kemasan;
        this.berat_produk = berat_produk;
        this.total_sekali_produksi = total_sekali_produksi;
    }

    public void setHPP() {
        harga_pokok_produksi = total_biaya_bahanbaku + biaya_TKL;
    }

    public void setDaftarBahan(ArrayList<Bahan> daftar_bahan){
        this.daftar_bahan = daftar_bahan;
    }

    public void setTenagaKerja(ArrayList<TenagaKerja> daftar_tenaga_kerja){
        this.daftar_tenaga_kerja = daftar_tenaga_kerja;
    }

    public void produksi(int total_sekali_produksi, int output_produksi_perhari, int[] list_bahan){
        for (int i = 0; i < daftar_bahan.size(); i++) {
            total_biaya_bahanbaku += list_bahan[i] / total_sekali_produksi * daftar_bahan.get(i).getHargaSatuan();
        }
        int hari_kerja_perbulan_max = 0;
        for (int i = 0; i < daftar_tenaga_kerja.size(); i++) {
            total_biaya_tenagakerja += daftar_tenaga_kerja.get(i).getGajiPerbulan();
            hari_kerja_perbulan_max = Math.max(daftar_tenaga_kerja.get(0).getHariKerjaPerbulan(), daftar_tenaga_kerja.get(i).getHariKerjaPerbulan());
        }
        biaya_TKL = total_biaya_tenagakerja / (output_produksi_perhari * hari_kerja_perbulan_max);
    }

    public void setMargin(double margin[]){
        this.margin = margin;
    }

    public void setPriceStructure(){
        for (int i = 0; i < margin.length; i++) {
            if (i == 0) {
                jual[i] = Math.ceil(harga_pokok_produksi * margin[i] + harga_pokok_produksi);
            }else{
                jual[i] = Math.ceil((jual[i-1] * margin[i] + jual[i-1]));
            }
        }
    }

    public void printTotalBiayaBahanBaku(){
        System.out.println("Total Biaya Bahan Baku : " + total_biaya_bahanbaku);
    }

    public void printTotalBiayaTKL(){
        System.out.println("Total Biaya TKL : " + biaya_TKL);
    }
    public void printHPP(){
        System.out.println("HPP : " + harga_pokok_produksi);
    }

    public void printPriceStructure(){
        for (int i = 0; i < jual.length; i++) {
            System.out.println(customer[i] + " : " + jual[i]);
        }
    }

}
