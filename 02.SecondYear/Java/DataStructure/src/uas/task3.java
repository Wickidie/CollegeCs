package uas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class task3{
    public static String shifting(String s, int num, String dir) {
        if (dir.equals("LEFT") || dir.equals("left")) {
            String stl = s.substring(0, 1);
            String str = s.substring(1, s.length());

            s = str+stl;
            System.out.println(str + stl);

            if (num == 1) {
                return str + stl;
            }else{
                num--;
                return shifting(s, num, dir);
            }
        }else if (dir.equals("RIGHT") || dir.equals("right")){
            String stl = s.substring(0, s.length()-1);
            String str = s.substring(s.length()-1, s.length());

            s = str+stl;
            System.out.println(str + stl);

            if (num == 1) {
                return str + stl;
            }else{
                num--;
                return shifting(s, num, dir);
            }
        }
        return "ERROR";
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        String s =in.nextLine();
        int num = in.nextInt();
        //in = new Scanner(System.in);
        String dir = in.nextLine();

        shifting(s, num, dir);
        
        in.close();
    }
}
// NAMA    : Marvin Adinata
// NIM     : 312110009