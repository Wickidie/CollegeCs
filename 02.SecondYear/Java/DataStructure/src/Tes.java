import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Tes{
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    String arr[] = {"asdasd", "ASDAS"};
    ArrayList<String> al = new ArrayList<>();
    int numbers1[] = { 1, 2, 3, 4, 5 };
    int numbers2[] = { 1, 2, 3, 4, 5 };
    int numbers3[] = numbers1;
    
    System.out.println(numbers1);
    System.out.println(numbers2);
    System.out.println(numbers3);
    for (int i = 0; i < numbers1.length; i++) {
      System.out.println(numbers1[i]);
    }
    for (int i = 0; i < numbers3.length; i++) {
      System.out.println(numbers1[i]);
    }
    numbers1[0] = 100;
    for (int i = 0; i < numbers1.length; i++) {
      System.out.println(numbers1[i]);
    }
    for (int i = 0; i < numbers3.length; i++) {
      System.out.println(numbers1[i]);
    }
    
    TestClass testClass1 = new TestClass();
    TestClass testClass2 = testClass1;

    System.out.println(testClass1);
    System.out.println(testClass2);
    System.out.println(testClass1.getTestNum());
    System.out.println(testClass2.getTestNum());
    testClass1.setTestNum(10);
    System.out.println(testClass1.getTestNum());
    System.out.println(testClass2.getTestNum());

    in.close();
  } 
}