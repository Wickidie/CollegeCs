package kb3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class KB3_1{
    public static int pangkat(int base, int exp) {
        int sum = base;

        for (int i = 0; i < exp-1; i++) {
            sum *= base;
        }

        return sum;
    }
    public static int pangkatRec(int base, int exp) {
        if (exp == 1) {
            return base;
        }else{
            exp--;
            return base*pangkatRec(base, exp);
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        System.out.println(pangkat(2, 8));
        System.out.println(pangkatRec(2, 8));

        in.close();
    }
}
// NAMA    : Marvin Adinata
// NIM     : 312110009