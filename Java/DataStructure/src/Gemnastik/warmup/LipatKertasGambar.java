package Gemnastik.warmup;
import java.util.Scanner;

public class LipatKertasGambar {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        int p = in.nextInt();
        int kertas[][] = new int[p][3];

        for (int i = 0; i < p; i++) {
            kertas[i][0] = in.nextInt();
            kertas[i][1] = in.nextInt();
            kertas[i][2] = in.nextInt();
        }

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < kertas[i][2]; j++) {
                if (kertas[i][0] == 0 && kertas[i][1] == 0) {
                    break;
                }
                if (kertas[i][0] > kertas[i][1]) {
                    kertas[i][0] /= 2;
                }else{
                    kertas[i][1] /= 2;
                }
            }
        }

        for (int i = 0; i < p; i++) {
            if (kertas[i][0] > kertas[i][1]) {
                System.out.print(kertas[i][0] + " " + kertas[i][1]);
            }else{
                System.out.print(kertas[i][1] + " " + kertas[i][0]);

            }
            System.out.println();
        }

        in.close();
      }     
}
