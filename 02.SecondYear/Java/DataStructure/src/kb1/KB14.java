package kb1;

import java.util.Scanner;

class KB14 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        /**
         * Operator "=" digunakan untuk 
         * "mengassign" nilai di sebuah variable dengan
         * tipe data yang sama
         */
        int a = 10; int b = 20; int c = 30;
        boolean x = true; boolean y = false; boolean z = true;
        c = a;
        x = y;

        System.out.println(c = b); 
        System.out.println(x = z); 
        /* 
        * Operator "==" digunakan untuk 
        * "membandingkan" nilai-nilai dari 2 variable dengan
        * tipe data yang sama
        */
        System.out.println(c == b);
        System.out.println(x == y);

        // Ini salah karena kedua tipe datanya berbeda
        // c = x;
        // System.out.println(c = x); System.out.println(c == x);
         
        in.close();
    }
}