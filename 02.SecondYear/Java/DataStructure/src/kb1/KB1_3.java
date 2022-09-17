package kb1;

import java.util.Random;
import java.util.Scanner;

class KB1_3{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        
        String code = "";
        code += "KLEE";
        code += rng.nextInt(90)+10;
        int a = rng.nextInt(10)+65;
        code += (char)a;
        code += rng.nextInt(55)+23;
        a = rng.nextInt(16)+75;
        code += (char)a;

        System.out.println(code);

        String redeem = in.nextLine();
        if (redeem.equals(code)) {
            System.out.println("100 pimogems");
        }else{
            System.out.println("invalid code");
        }

        in.close();
    }
}