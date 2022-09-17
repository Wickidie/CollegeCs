package uas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class task1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        int start = in.nextInt();
        int range = in.nextInt();
        int lenght = in.nextInt();

        do {
            System.out.print(start + " ");
            start += range;
            lenght--;
        } while (lenght >= 1);
        
        in.close();
    }
}
// NAMA    : Marvin Adinata
// NIM     : 312110009