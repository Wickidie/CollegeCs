package TestClass;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double w = in.nextDouble();
        double h = in.nextDouble();
        double bmi;

        bmi = w / h * h;
        System.out.println(bmi);

        if (h == 1) {

        } else if (w == 1) {

        } else {

        }

        in.close();
    }
}
