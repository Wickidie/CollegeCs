package kb1;

import java.util.ArrayList;

public class Chart {
    private final int MAXDATA = 10;
    // private int arr[] = new int[MAXDATA];

    private ArrayList<Item> al = new ArrayList<>();


    public void addChart(Item item) {
        if (al.size() >= MAXDATA) {
            System.out.println("UDAH 10 ITEM GAES");
        }else{
            al.add(item);
        }
    }

    public int getTotalPrice() {
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i).getN()*al.get(i).getTotal();
        }
        return sum;
    }
    public void printTotalPrice() {
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Item ke " + (i+1) + " = " +
                al.get(i).getN()*al.get(i).getTotal());
            sum += al.get(i).getN()*al.get(i).getTotal();
        }
        System.out.println("Total All Item Prices= " + sum);
    }
    public int getTotalAfterDiscount() {
        return (int)(getTotalPrice()*0.9);
    }
    public void printTotalAfterDiscount() {
        System.out.println("Total After Discount = " +
            getTotalAfterDiscount());
    }
    public int getHighestItemPrice() {
        int most = al.get(0).getN();
        for (int i = 1; i < al.size(); i++) {
            if (most < al.get(i).getN()*al.get(i).getTotal()) {
                most = al.get(i).getN()*al.get(i).getTotal();
            }
        }
        return most;
    }
    public void printHighestItemPrice() {
        System.out.println("Highest Item Price = " +
            getHighestItemPrice());
    }
    
}
