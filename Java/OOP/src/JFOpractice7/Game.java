package JFOpractice7;

import java.util.Random;

public class Game {
    public static void playMahjong(Card card) {
        if (card.getCredit() >= 3) {
            Random rng = new Random();
            int reward = rng.nextInt(10);
            card.addTicket(reward);
            card.subtractCredit(3);
            System.out.println("\nPlayed Mahjong, add " + reward + " ticket");
        }else{
            System.out.println("\nNot enough credit, need 3 credit to play Mahjong");
        }
        System.out.println("You played on " + card.getName() + " card");
        System.out.println("Your credit rn is = " + card.getCredit());
        System.out.println("Your ticket rn is = " + card.getTicket());
    }

    public static void playSolitare(Card card) {
        if (card.getCredit() >= 5) {
            Random rng = new Random();
            int reward = rng.nextInt(20);
            card.addTicket(reward);
            card.subtractCredit(5);
            System.out.println("\nPlayed Solitare, add " + reward + " ticket");            
        }else{
            System.out.println("\nNot enough credit, need 5 credit to play Solitare");
        }
        System.out.println("You played on " + card.getName() + " card");
        System.out.println("Your credit rn is = " + card.getCredit());
        System.out.println("Your ticket rn is = " + card.getTicket());
    }
}
