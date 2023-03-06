package biodata;
public class Tanggal {
    private int tanggal;
    private int bulan;
    private int tahun;


    public Tanggal(int tanggals, int bulans, int tahuns){
        tanggal = tanggals;
        bulan = bulans;
        tahun = tahuns;

    }

    public int getTanggal(){return tanggal;}
    public int getBulan(){return bulan;}
    public int getTahun(){return tahun;}

}
