package JFOpractice7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Card BCA = new Card("BCA");
        Card BNI = new Card("BNI");
        System.out.println("Card ID BCA = " + BCA.getCardID());
        System.out.println("Card ID BNI = " + BNI.getCardID());
        Terminal.topup(BCA, 5);
        Terminal.topup(BNI, 10);
        System.out.println("Credit in BCA = " + BCA.getCredit());
        System.out.println("Credit in BNI = " + BNI.getCredit());

        Game.playMahjong(BCA);
        Game.playSolitare(BCA);
        Game.playMahjong(BNI);
        Game.playSolitare(BNI);
        
        Terminal.transferCredit(BCA, BNI);
        Terminal.transferTicket(BCA, BNI);
        
        Terminal.exchangePrize(BNI);
        
        Game.playMahjong(BCA);
        Game.playSolitare(BCA);
        Terminal.exchangePrize(BCA);
        
        System.out.println("Credit in BCA = " + BCA.getCredit());
        System.out.println("Credit in BNI = " + BNI.getCredit());
        
        // int option = 1;
        // do {
        //     System.out.println("\nChoose action :" + 
        //                         "\n1. Topup" + 
        //                         "\n2. Check Credit" + 
        //                         "\n3. Check Ticket" +
        //                         "\n4. Play Game" +
        //                         "\n5. Exchange Prize" +
        //                         "\n0. Quit");
        //     System.out.print("Select Action = ");
        //     option = in.nextInt();
        //     switch (option) {
        //         case 1:
                    
        //             break;
        //         case 2:
                    
        //             break;
        //         case 3:
                    
        //             break;
        //         case 4:
                    
        //             break;
        //         case 5:
                    
        //             break;
        //         case 0:
        //             System.out.println("TY ;)");
        //             break;
        //         default:
        //             System.out.println("Not an option");
        //             break;
        //     }
        // } while (option > 0);

    }
}
