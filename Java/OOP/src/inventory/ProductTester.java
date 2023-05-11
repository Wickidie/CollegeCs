package inventory;

import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many product?");
        int num = -1;
        int max_product = -1;
        do {
            try {
                max_product = getNumProduct(in);
            } catch (Exception e) {
                System.out.println("Enter Number");
            }
        } while (max_product < 0);
        do {
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
        } while (num < 0);

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
        int num = 0;
        int i = 0;
        do {
            System.out.println("1: CD\n"
                    + "2: DVD\n"
                    + "Please enter the product type: ");
            try {
                num = in.nextInt();
                switch (num) {
                    case 1:
                        addCDToInventory(arr, in, i);
                        i++;
                        break;
                    case 2:
                        addDVDToInventory(arr, in, i);
                        i++;
                        break;
                    default:
                        System.out.println("Only numbers 1 or 2 allowed!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Only input number");
            }
        } while (num > 2 || num < 1 || num != arr.length);
    }

    public static void addCDToInventory(Product arr[], Scanner in, int i) {
        System.out.println("num, name, qty, price, artist, num_of_song, label");
        int tempNumber = in.nextInt();
        in.nextLine(); // Clear buffer
        String tempName = in.nextLine();
        int tempQty = in.nextInt();
        in.nextLine(); // Clear buffer
        double tempPrice = in.nextDouble();
        in.nextLine(); // Clear buffer
        String artist = in.nextLine();
        int num_of_song = in.nextInt();
        in.nextLine(); // Clear buffer
        String label = in.nextLine();
        arr[i] = new CD(tempNumber, tempName, tempQty, tempPrice, artist, num_of_song, label);
    }

    public static void addDVDToInventory(Product arr[], Scanner in, int i) {
        System.out.println("num, name, qty, price, lenght, age_rating, film_studio");
        int tempNumber = in.nextInt();
        in.nextLine(); // Clear buffer
        String tempName = in.nextLine();
        int tempQty = in.nextInt();
        in.nextLine(); // Clear buffer
        double tempPrice = in.nextDouble();
        in.nextLine(); // Clear buffer
        int length = in.nextInt();
        int age_rating = in.nextInt();
        in.nextLine(); // Clear buffer
        String film_studio = in.nextLine();
        arr[i] = new DVD(tempNumber, tempName, tempQty, tempPrice, length, age_rating, film_studio);
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
        int num = 0;
        displayInventory(arr);
        System.out.println("Choose product");
        do {
            try {
                num = in.nextInt();
                if (num > arr.length || num < 1) {
                    System.out.println("Enter number from 1 to " + arr.length);
                }
            } catch (Exception e) {
                System.out.println("Enter Number GPN");
                num = -1;
            }
        } while (num > arr.length || num < 1);
        return num - 1;
    }

    public static void addInventory(Product arr[], Scanner in) {
        int num = 0;
        int stock = -1;
        do {
            try {
                num = getProductNumber(arr, in);
                if (arr[num].isStatus()) {
                    System.out.println("How many?");
                    stock = in.nextInt();
                } else {
                    System.out.println("Cant add, product is discontinued\n");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Enter a number");
                num = -1;
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
