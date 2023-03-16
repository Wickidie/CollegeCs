package JFOpractice7;

import java.util.Scanner;

public class Terminal {
    private static String prize_list[] = {"Ayam", "Babi", "Cicak", "Dugong", "Eucalyptus"};
    private static int prize_cost[] = {10, 20, 30, 40, 50};
    private static int prize_amount[] = {5, 4, 3, 2, 1};

    public static void exchangePrize(Card card) {
        Scanner in = new Scanner(System.in);
        int option;

        System.out.println("\nYour " + card.getName() + 
                            " tickets " + card.getTicket());
        System.out.println("Prize List:");
        for (int i = 0; i < prize_list.length; i++) {
            System.out.println(i+1 + ". " + prize_list[i] + " " + 
                                prize_amount[i] + " left, each cost " + 
                                prize_cost[i]);
        }
        System.out.print("\nSelect prize = ");
        option = in.nextInt() - 1;
        if (prize_amount[option] > 0) {
            if (card.getTicket() >= prize_cost[option]) {
                System.out.println("\nYou exchanged " + prize_list[option] + 
                " for the cost of " + prize_cost[option] + " tickets");            
                card.addPrize(prize_list[option]);
                card.subtractTicket(prize_cost[option]);
                prize_amount[option]--;
            }else{
                System.out.println("\nNot enough ticket, need " + prize_cost[option] +
                                    " ticket to exhange " + prize_list[option]);
            }
        }else{
            System.out.println("\n" + prize_list[option] + " is sold out");
        }
        System.out.println("Your " + card.getName() + " ticket rn is " + card.getTicket());
    }

    public static void topup(Card card, int dollar) {
        card.addCredit(dollar * 2);
    }

    public static void transferCredit(Card from, Card to) {
        System.out.println("\nCard " + from.getName() + " -> " + to.getName());
        System.out.println("Credit " + from.getCredit() + " + " + to.getCredit());
        to.addCredit(from.getCredit());
        from.subtractCredit(from.getCredit());
    }
    public static void transferTicket(Card from, Card to) {
        System.out.println("\nCard " + from.getName() + " -> " + to.getName());
        System.out.println("Ticket " + from.getTicket() + " + " + to.getTicket());
        to.addTicket(from.getTicket());
        from.subtractTicket(from.getTicket());
    }

}
