package TestClass;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

class Animal { // Superclass (parent)
    int a;

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void ANIMALO() {

    }
}

class Dog extends Animal { // Subclass (child)
    int d;

    public void animalSound() {
        // super.animalSound(); // Call the superclass method
        System.out.println("The dog says: bow wow");
    }

    public void DOGO() {

    }
}

public class TestMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        // Dog dogy = new Dog();
        // Animal dozy = new Dog();
        // dogy.animalSound();
        // dozy.animalSound();

        // Math.min(0, 0);
        // in.nextLine();
        // Math.sin(0);

        // // dogy.

        // System.out.println(doggy);
        // System.out.println(dogy);

        System.out.println(rng.nextInt());
        System.out.println(Math.random() * 1000);

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
