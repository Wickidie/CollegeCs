package Gemnastik.qualification;
import java.util.Scanner;
import java.lang.Math;

public class Jangkauan_Bom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int xc = in.nextInt();
        int yc = in.nextInt();
        int n = in.nextInt();
        int xm[] = new int[n];
        int ym[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            xm[i] = in.nextInt();
            ym[i] = in.nextInt();
        }
        
        int j = in.nextInt();
        int r[] = new int[n];
        for (int i = 0; i < j; i++) {
            r[i] = in.nextInt();
        }

        for (int i = 0; i < j; i++) {
            int sum = 0;
            for (int k = 0; k < n; k++) {
                if (Math.sqrt(Math.pow(xm[k]-xc, 2) 
                + Math.pow(ym[k]-yc, 2)) <= r[i]) {
                    sum++;
                }
            }
            System.out.println(sum);
        }

        in.close();
    }
    
// 3 1
// 7
// 4 3
// -2 -2
// 3 -2
// 3 -4
// 6 1
// -3 5
// 8 5
// 2
// 5
// 1

}
