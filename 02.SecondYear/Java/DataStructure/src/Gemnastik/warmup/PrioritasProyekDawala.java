package Gemnastik.warmup;
import java.util.Scanner;
import java.lang.Math;

public class PrioritasProyekDawala {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int p = in.nextInt();

        String str[][] = new String[p][2];
        int cor[][] = new int[p][6];
        int arr[] = new int[3];

        for (int i = 0; i < p; i++) {
            str[i][0] = in.next();
            cor[i][0] = in.nextInt();
            cor[i][1] = in.nextInt();
            cor[i][2] = in.nextInt();

            str[i][1] = in.next(); 
            cor[i][3] = in.nextInt();
            cor[i][4] = in.nextInt();
            cor[i][5] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.sqrt(
            Math.pow((cor[i][3]-cor[i][0]), 2) + 
            Math.pow((cor[i][4]-cor[i][1]), 2));
        }  

        int tempInt;
        String tempStr;
        boolean swapped;
        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i] > arr[i+1]) {
                    tempInt = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tempInt;
                    
                    tempStr = str[i][0];
                    str[i][0] = str[i+1][0];
                    str[i+1][0] = tempStr;

                    tempStr = str[i][0];
                    str[i][1] = str[i+1][1];
                    str[i+1][1] = tempStr;
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
        }

        System.out.println();
        for (int i = p-1; i > -1; i--) {
            for (int j = 0; j < 2; j++) {
                System.out.print(str[i][j] + " ");
            }
            System.out.println(arr[i]);
        }

        in.close();
    }
}
