package uas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class task2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        String s = in.nextLine();
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length()-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= -i; j--) {
                System.out.print(s.charAt(Math.abs(j)));
            }
            System.out.println();
        }
        
        in.close();
    }
}
// NAMA    : Marvin Adinata
// NIM     : 312110009