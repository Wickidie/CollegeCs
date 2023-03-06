package kb3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class KB3_2{
    public static String shiftCharacter(String s, int dir, int num) {
        if (dir == 0) {
            String stl = s.substring(0, num);
            String str = s.substring(num, s.length());

            return str + stl;
        }else{
            String stl = s.substring(0, s.length()-num);
            String str = s.substring(s.length()-num, s.length());

            return str + stl;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        System.out.println(shiftCharacter("Indonesia Jaya", 0, 3));
        System.out.println(shiftCharacter("Indonesia Jaya", 1, 3));

        in.close();
    }
}
// NAMA    : Marvin Adinata
// NIM     : 312110009