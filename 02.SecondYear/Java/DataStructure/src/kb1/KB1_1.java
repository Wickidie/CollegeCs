package kb1;

import java.util.Scanner;

class KB1_1{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if (num > 0) {
            if (num % 21 == 0) {
                System.out.println("bakudan");
            } else if (num % 3 == 0) {
                System.out.println("boom");
            }else if (num % 7 == 0) {
                System.out.println("booooom");
            }else{
                System.out.println(num);
            }
        }

        in.close();
    }
}