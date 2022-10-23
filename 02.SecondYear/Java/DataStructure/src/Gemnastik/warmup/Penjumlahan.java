package Gemnastik.warmup;
import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,m,q;

        n = in.nextInt();
        m = in.nextInt();
        q = in.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int x1,x2,y1,y2;

        for (int k = 0; k < q; k++) {
            int sum = 0;
            x1 = in.nextInt();
            y1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();
            for (int i = x1-1; i < x2; i++) {
                for (int j = y1-1; j < y2; j++) {
                    sum += arr[i][j];
                }
            }
            System.out.println(sum);
        }



        in.close();
    }
}
