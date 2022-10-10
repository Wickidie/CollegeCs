package maniparray;
import java.util.Scanner;

public class ManipulasiArray{
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    ArrayData ad = new ArrayData();
    ad.insertData(new Customer(1, 7000, "albert", "malang"));
    ad.insertData(new Customer(2, 6000, "david", "surabaya"));
    ad.insertData(new Customer(3, 4000, "handika", "batu"));
    ad.insertData(new Customer(4, 1000, "bernadus", "malang"));
    ad.insertData(new Customer(5, 5000, "cevin", "surabaya"));

    ad.printDataAll();
    System.out.println("TOP CUSTOMER = " +
    ad.topCustomerBal().getBal());
    System.out.println("LONGEST NAME = " +
    ad.longestName().getName());
    System.out.println();

    Customer sameAdrs[] = ad.showCustomerAt("malang");
    for (int i = 0; i < sameAdrs.length; i++) {
      System.out.println(sameAdrs[i].getAll());
    }
    System.out.println();

    ad.deleteData("bernadus");
    ad.printDataAll();
   
    in.close();
  }
}  