import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Produk produk_1 = 
        new Produk("Wedhang Jahe A", "gram", "sachet", 85, 5);

        ArrayList<Bahan> bahan_produk_1 = new ArrayList<Bahan>();
        bahan_produk_1.add(new Bahan("Gula", "gram", 13000, 1000));
        bahan_produk_1.add(new Bahan("Jahe", "gram", 75000, 1000));
        bahan_produk_1.add(new Bahan("Kemasan Sachet", "pcs", 850, 1));
        
        ArrayList<TenagaKerja> tenaga_kerja_1 = new ArrayList<TenagaKerja>();
        tenaga_kerja_1.add(new TenagaKerja("Produksi", 2, 170000, 24));
        tenaga_kerja_1.add(new TenagaKerja("Produksi", 1, 85000, 24));
        
        int list_bahan_produksi[] = {2000, 1000, 5};
        double margin[] = {1.0, 0.1, 0.25};
        
        produk_1.setDaftarBahan(bahan_produk_1);
        produk_1.setTenagaKerja(tenaga_kerja_1);
        produk_1.setMargin(margin);
        produk_1.produksi(5, 150, list_bahan_produksi);
        produk_1.setHPP();
        produk_1.setPriceStructure();
        
        produk_1.printTotalBiayaBahanBaku();
        produk_1.printTotalBiayaTKL();
        produk_1.printHPP();
        produk_1.printPriceStructure();

    }
}
