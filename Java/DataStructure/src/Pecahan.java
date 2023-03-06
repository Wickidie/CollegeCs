import java.util.Scanner;

public class Pecahan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a1 = in.nextInt();
        float a2 = in.nextInt();
        float b1 = in.nextInt();
        float b2 = in.nextInt();

        if (a1/a2 == b1/b2) {
            System.out.println("sama");
        }else if (a1/a2 > b1/b2) {
            System.out.println("lebih besar");
        }else{
            System.out.println("lebih kecil");
        }
        System.out.println(a1/a2);
        System.out.println(b1/b2);

        in.close();
    }
}
