package TestClass;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;


public class TestMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        System.out.println(rng.nextInt());
        System.out.println(Math.random()*1000);

        int x = 12;
        String str1 = "MAMA";
        String str2 = "MAMA";

        System.out.println(str1.equals(str2));

        TestClass TC1 = new TestClass(6, 9);
        TestClass TC2 = new TestClass(9, 6);
        
        System.out.println(TC1.printTC(TC1));
        System.out.println(TC2.printTC(TC1));

        System.out.println(TestClass.staticPrintTC(TC2));
        System.out.println(TestClass.count);

        System.out.println(TestAnotherClass.name());

    }   
}
