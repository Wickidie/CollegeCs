package biodata;
public class Biodata {
    private int nip;
    private String nama;
    private Tinggal alamat;
    private Tanggal tanggalmulaikerja;

    public Biodata(int nips, String namas,Tinggal alamats, Tanggal tanggalmulaikerjas){
        nip = nips;
        nama = namas;
        alamat = alamats;
        tanggalmulaikerja = tanggalmulaikerjas;
    }

    public int getNip(){return nip;}
    public Tinggal getAlamat(){return alamat;}
    public String getNama(){return nama;}
    public Tanggal getTanggalMulaiKerja(){return tanggalmulaikerja;}
}
