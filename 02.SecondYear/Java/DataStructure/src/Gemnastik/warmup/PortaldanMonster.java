package Gemnastik.warmup;
import java.util.Scanner;
import java.util.ArrayList;

public class PortaldanMonster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,k;
        n = in.nextInt();
        k = in.nextInt();

        int sarang[] = new int[n];
        int terowongan[][] = new int[k][2];

        for (int i = 0; i < n; i++) {
            sarang[i] = in.nextInt();
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 2; j++) {
                terowongan[i][j] = in.nextInt();
            }
        }

        int sum = 0;
        int num = 0;
        int sarangKe = 0;
        int lastPortal = 0;
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        
        for (int i = 0; i < k; i++) {
            if (terowongan[i][0] != lastPortal) {
                arrL.add(num);
                num = 0;
                num += sarang[sarangKe]+sarang[sarangKe+1];
                sarangKe += 2;
            }else{
                num += sarang[sarangKe];
                sarangKe++;
            }
            lastPortal = terowongan[i][1];
        }
        arrL.add(num);
        arrL.sort(null);
        
        int portal = 1;

        for (int i = arrL.size()-1; i > 0; i--) {
            sum += arrL.get(i)*portal;
            portal++;
        }

        System.out.println(sum);

        in.close();
    }
}
