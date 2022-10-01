package maniparraylist;

import java.util.ArrayList;

public class ArrayListData{
  private static final int MAXDATA = 5;

  private ArrayList<Customer> al = new ArrayList<>();



  public void insertData(Customer cust) {
    if (al.size() < MAXDATA) {
      al.add(cust);
    }else{
      System.out.println("DATANYA FULL GAES!");
    }
    System.out.println();
  }

  public void deleteDataAt(int index) {
    if (index >= MAXDATA) {
      System.out.println("KELEWATAN INDEXNYA GAES!");
    }else{
      if (al.size() <= 0) {
        System.out.println("ENGGA ADA DATA GAES!");
      }else{
        al.remove(index);
      }
    }
  }

  public void deleteAllDuplicate(String str){
    if (al.size() <= 0) {
      System.out.println("UDAH KOSONG -_-!");
    }
    for (int i = 0; i < al.size(); i++) {
      if (al.get(i).getAddress().equalsIgnoreCase(str)) {
        al.remove(i);
      }
      System.out.println("SEMUA " + str + " UDAH TAK APUS GES!");
    }
  }
  
  public void deleteAllData() {
    if (al.size() <= 0) {
      System.out.println("ENGGA ADA DATA GAES!");
    }else{
      while (al.size() > 0) {
        al.remove(0);
      }
    }
    System.out.println("DAH TAK APUS SEMUANNYA!");
  }
  
  public void printDataAt(int index) {
   al.get(index).printAll();
  }

  public void printDataAll() {
    if (al.size() <= 0) {
      System.out.println("KOSONG DATANYA -_-!");
    }else{
      for (int i = 0; i < al.size(); i++) {
        System.out.println(al.get(i).printAll());
      }
    }
    System.out.println();
  }

  public void printDataSize() {
    System.out.println(al.size());
  }

  public void name() {
    
  }



  
  
  
}