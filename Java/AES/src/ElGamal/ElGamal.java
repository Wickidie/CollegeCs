package ElGamal;

import java.math.BigInteger;

public class ElGamal {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 10));
        System.out.println(Math.pow(91, 43));
        System.out.println(Math.pow(91, 43) % 107);
        System.out.println(21 * Math.pow(91, 43) % 107);
        System.out.println(5 % 2);
        System.out.println();
        System.out.println(Math.pow(2, 57) % 107);
        System.out.println(Math.pow(46, 57) * 83);

        double a = Math.pow(46, 57) * 83;
        double b = a % 107;
        BigInteger big_a;

        System.out.println(a);
        System.out.println(b);

        System.out.println(Math.pow(46, 57) * 83 % 107);
        
    }
    
}