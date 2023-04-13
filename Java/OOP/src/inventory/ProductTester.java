package inventory;

import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tempNumber = in.nextInt();
        in.nextLine();
        String tempName = in.nextLine();
        int tempQty = in. nextInt();
        double tempPrice = in.nextDouble();
        Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);
        
        tempNumber = in.nextInt();
        in.nextLine();
        tempName = in.nextLine();
        tempQty = in. nextInt();
        tempPrice = in.nextDouble();        
        Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);

        Product p3 = new Product(3, "Fullo", 300, 30.7);
        Product p4 = new Product(4, "Cokolatos", 400, 40.8);
        Product p5 = new Product(5, "TimTam", 500, 50.9);
        Product p6 = new Product(6, "KongGuan", 600, 60.1);

        p6.setStatus(false);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());


        in.close();
    }
}
