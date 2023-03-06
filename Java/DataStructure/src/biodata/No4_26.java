package biodata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class No4_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        Biodata array[] = new Biodata[3];

        array[0] = new Biodata
        (312110009, 
        "Marvin", 
        new Tinggal("Singaraja", "jalan aspal", 888888), 
        new Tanggal(11, 3, 2003));

        array[1] = new Biodata
        (312110012, 
        "Adinata", 
        new Tinggal("Seririt", "jalan paving", 777777), 
        new Tanggal(12, 12, 2003));

        array[2] = new Biodata
        (312110020, 
        "Boy", 
        new Tinggal("Jakarta", "jalan tol", 999999), 
        new Tanggal(17, 8, 1945));

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].getNip() + " ");
            System.out.print(array[i].getNama() + " ");
            System.out.print(array[i].getAlamat().getKota() + " ");
            System.out.print(array[i].getAlamat().getJalan() + " ");
            System.out.print(array[i].getAlamat().getKode_pos() + " ");
            System.out.print(array[i].getTanggalMulaiKerja().getTanggal() + " ");
            System.out.print(array[i].getTanggalMulaiKerja().getBulan() + " ");
            System.out.print(array[i].getTanggalMulaiKerja().getTahun() + " ");
            System.out.println();
        }

        in.close();
    }
}
