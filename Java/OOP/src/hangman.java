import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class PRGM5_9{
    public static void printArray(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        ArrayList<String> q = new ArrayList<>(Arrays.asList(
            "Presiden pertama Indonesia.",
            "Yang buat program ini.",
            "Makanan kesukaan Marvin",
            "Asalnya Marvin",
            "Tahun Marvin lahir"
            ));
        ArrayList<String> ans = new ArrayList<>(Arrays.asList(
            "soekarno",
            "marvin",
            "siobak",
            "bali",
            "2003"
        ));
        ArrayList<Integer> box = new ArrayList<>();
        int num = 0;
        int a = 0;
        String s = "";

        for (int i = 0; i < q.size(); i++) {
            do{
                num = rng.nextInt(5);
                if (box.contains(num) == false) {
                    box.add(i, num);
                    break;
                }
            }while(box.contains(num));
        }
        System.out.println("box = " + box);
        
        for (int k = 0; k < q.size(); k++) {
            int count = 0;
            boolean win = false;
            ArrayList<String> arr = new ArrayList<>();
            ArrayList<String> log = new ArrayList<>();

            a = box.get(k);
            for (int i = 0; i < ans.get(a).length(); i++) {
                arr.add(i, "_");
            }
            do{
                do {
                    printArray(arr);
                    System.out.println("Hint : " + q.get(a));
                    System.out.println("Tebak huruf / jawab (1/2) ?");
                    num = in.nextInt();
                } while (num != 1 && num != 2);
                in = new Scanner(System.in);
                switch (num) {
                    case 1:
                        System.out.println("Huruf : ");
                        s = in.nextLine();
                        for (int i = 0; i < ans.get(a).length(); i++) {
                            if (s.charAt(0) == ans.get(a).charAt(i)) {
                                arr.set(i, s);
                            }
                        }
                        log.add(s);
                        System.out.println("Log : " + log);
                        if (arr.contains("_") == false) {
                            win = true;
                        }
                        break;
                    case 2:
                        System.out.println("Jawab : ");
                        s = in.nextLine();
                        if (s.equals(ans.get(a))) {
                            win = true;
                        }else{
                            System.out.println("Wrong Answer!");
                        }
                        break;
                    default:
                        break;
                }
                count++;
                System.out.println("Count = " + count);
                System.out.println();
            }while(win == false && count != 5);
    
            if (win) {
                System.out.println("You are Right");
            }else{
                System.out.println("You Lose");
            }
        }
        System.out.println("do you want to continue (yes/no)?");
        s = in.nextLine();
        if (s.equals("yes")) {
            main(args);
        }

        in.close();
    }
}
// NAMA    : Marvin Adinata
// NIM     : 312110009