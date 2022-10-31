package Gemnastik.qualification;
import java.util.Scanner;

public class Permainan_Batu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        
        if (k*m % 2 == 0) {
            System.out.println("Kedua");
        }else{
            System.out.println("Pertama");
        }

        in.close();
    }   
}
