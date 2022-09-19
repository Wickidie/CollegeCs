import java.util.Scanner;

import maniparray.Customer;

import java.util.ArrayList;
import java.util.Random;

class Tes{
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    ArrayList<String> al = new ArrayList<>();

    int cnt = 0;

    al.add("asd");
    al.add("asd");
    al.add("asd");

    // System.out.println(al.remove("asd"));
    // System.out.println(al.remove("asd"));
    // System.out.println(al.remove("asd"));
    // System.out.println(al.remove("asd"));

    while (al.remove("asd") == true) {
      cnt++;
      System.out.println(cnt);
      System.out.println(al.isEmpty());
      al.remove("asd");
    }
    System.out.println();
    System.out.println(al.isEmpty());
    
    
    
    in.close();
  } 
}