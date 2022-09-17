package kb1;

import java.util.Scanner;

class KB13 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String score = in.nextLine();

        switch (score.charAt(0)) {
            case 'A':
                System.out.println("sempurna");
                break;
            case 'B':
                System.out.println("bagus");
                break;
            case 'C':
                System.out.println("cukup");
                break;
            case 'D':
                System.out.println("buruk");
                break;
            case 'F':
                System.out.println("sangat buruk");
                break;
            default:
                System.out.println("bukan nilai");
                break;
        }
         
        in.close();
    }
}