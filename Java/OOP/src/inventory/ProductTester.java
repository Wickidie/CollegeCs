package inventory;

import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int max_product = getNumProduct(in);
        if (max_product <= 0) {
            System.out.println("No product");
        } else {
            Product arr[] = new Product[max_product];
            addToInventory(arr, in);
            do {
                num = getMenuOption(in);
                executeMenuChoice(num, arr, in);
            } while (num != 0);
        }

        in.close();
    }

    public static int getNumProduct(Scanner in) {
        int max_product = 0;
        do {
            try {
                max_product = in.nextInt();
                if (max_product < 0) {
                    System.out.println("Incorrect Value entered");
                }
            } catch (Exception e) {
                System.out.println("Incorrect Data Type entered");
                in.nextLine();
            }
        } while (max_product < 0);
        return max_product;
    }

    public static void addToInventory(Product arr[], Scanner in) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("num, name, qty, price");
            int tempNumber = in.nextInt();
            in.nextLine(); // Clear buffer
            String tempName = in.nextLine();
            int tempQty = in.nextInt();
            in.nextLine(); // Clear buffer
            double tempPrice = in.nextDouble();
            arr[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
        }
    }

    public static void addCDToInventory(Product arr[], Scanner in) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("num, name, qty, price");
            int tempNumber = in.nextInt();
            in.nextLine(); // Clear buffer
            String tempName = in.nextLine();
            int tempQty = in.nextInt();
            in.nextLine(); // Clear buffer
            double tempPrice = in.nextDouble();
            arr[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
        }
    }

    public static void displayInventory(Product arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public static int getMenuOption(Scanner in) {
        int num = 0;
        do {
            System.out.println("1. View Inventory\n"
                    + "2. Add Stock\n"
                    + "3. Deduct Stock\n"
                    + "4. Discontinue Product\n"
                    + "0. Exit\n"
                    + "Please enter a menu option:");
            try {
                num = in.nextInt();
            } catch (Exception e) {
                System.out.println("Incorrect Data Type entered");
                in.nextLine();
            }
        } while (num < 0 || num > 4);
        return num;
    }

    public static void executeMenuChoice(int num, Product arr[], Scanner in) {
        switch (num) {
            case 1:
                displayInventory(arr);
                break;
            case 2:
                addInventory(arr, in);
                break;
            case 3:
                deductInventory(arr, in);
                break;
            case 4:
                discontinuedInventory(arr, in);
                break;

            default:
                break;
        }
    }

    public static int getProductNumber(Product arr[], Scanner in) {
        displayInventory(arr);
        System.out.println("Choose product");
        int num = in.nextInt();
        return num - 1;
    }

    public static void addInventory(Product arr[], Scanner in) {
        int num = getProductNumber(arr, in);
        int stock = -1;
        do {
            try {
                System.out.println("How many?");
                stock = in.nextInt();
            } catch (Exception e) {
                System.out.println("Enter a number");
            }
        } while (stock < 0);
        arr[num].addStock(stock);
    }

    public static void deductInventory(Product arr[], Scanner in) {
        int num = getProductNumber(arr, in);
        int stock = -1;
        do {
            try {
                System.out.println("How many?");
                stock = in.nextInt();
            } catch (Exception e) {
                System.out.println("Enter a number");
            }
        } while (stock < 0 || arr[num].getQty() < stock);
        arr[num].deductStock(stock);
    }

    public static void discontinuedInventory(Product arr[], Scanner in) {
        int num = getProductNumber(arr, in);
        arr[num].setStatus(false);
    }
}
