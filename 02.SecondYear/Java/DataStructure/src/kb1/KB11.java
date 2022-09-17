package kb1;

import java.util.Scanner;

class KB11 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        float r = in.nextFloat();
        float pi = (float)Math.PI;

        float volume = 4/3*pi*r*r;

        System.out.printf("%.3f", volume);

        in.close();
    }
}