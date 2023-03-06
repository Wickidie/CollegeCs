package maniparraylist;
import java.util.Scanner;

public class ManipulasiArray{
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    ArrayListData ad = new ArrayListData();
    ad.insertData(new Customer(1, 7000, "albert", "malang"));
    ad.insertData(new Customer(2, 6000, "david", "surabaya"));
    ad.insertData(new Customer(3, 4000, "handika", "batu"));
    ad.insertData(new Customer(4, 1000, "bernadus", "malang"));
    ad.insertData(new Customer(5, 5000, "cevin", "surabaya"));

    // ad.printDataAll();
    // ad.deleteAllDuplicate("malang");
    // ad.printDataAll();
    // ad.deleteAllDuplicate("surabaya");
    // ad.printDataAll();
    // ad.deleteAllData();
    // ad.printDataAll();
    // ad.deleteAllDuplicate("str");

    

    in.close();
  }
}  