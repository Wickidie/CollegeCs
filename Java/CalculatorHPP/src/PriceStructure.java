public class PriceStructure {
    private Produk produk;
    private String satuan;
    private int margin[];
    private int jual[];

    enum Cutomer{
        DISTRIBUTOR,
        RESELLER,
        ENDUSER
    }

    public PriceStructure(Produk produk, String satuan, int[] margin, int[] jual) {
        this.produk = produk;
        this.satuan = satuan;
        this.margin = margin;
        this.jual = jual;
    }


}
