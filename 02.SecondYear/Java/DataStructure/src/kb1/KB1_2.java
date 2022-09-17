package kb1;

import java.util.Random;
import java.util.Scanner;

class KB1_2{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        double bomb_r = 3;
        double fish_x = rng.nextInt(21)-10; 
        double fish_y = rng.nextInt(21)-10; 

        double pos_x = in.nextDouble();
        double pos_y = in.nextDouble();

        double area = Math.sqrt(Math.pow(pos_x-fish_x, 2)
        +Math.pow(pos_y-fish_y, 2));

        System.out.println(
        (area <= bomb_r)
        ?"Take that you little fish !"
        :"huft ... ^*(&^#* ");

        in.close();
    }
}
        // System.out.println(fish_x);
        // System.out.println(fish_y);

        // if (Math.sqrt
        // (Math.pow(pos_x-fish_x, 2)
        // +Math.pow(pos_y-fish_y, 2)) <= bomb_r){
        //     System.out.println("Take that you little fish !");
        // }else{
        //     System.out.println("huft ... ^*(&^#* ");
        // }