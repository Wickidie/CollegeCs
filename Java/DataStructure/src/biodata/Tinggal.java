package biodata;
public class Tinggal {
    private String kota;
    private String jalan;
    private int kode_pos;

    public Tinggal(String kotas, String jalans, int kode_poses){
        kota = kotas;
        jalan = jalans;
        kode_pos = kode_poses;
    }

    public String getKota(){return kota;}
    public String getJalan(){return jalan;}
    public int getKode_pos(){return kode_pos;}
}
