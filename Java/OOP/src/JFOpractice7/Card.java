package JFOpractice7;

public class Card {
    private static int card_count;
    private String name;
    private int id;
    private int credit;    
    private int ticket;
    private int prize_count;
    String prize[] = new String[5];   

    Card(String name){
        this.name = name;
        credit = ticket = prize_count = 0;
        id += 100  + card_count;
        card_count++;
    }
    
    public void setCredit(int new_credit) {
        credit = new_credit;
    }

    public String getName() {
        return name;
    }
    public int getCardID() {
        return id;
    }
    public int getCredit() {
        return credit;
    }
    public int getTicket() {
        return ticket;
    }
    // public int getPrizeCount() {
    //     return prize_count;
    // }
    // public String getPrize(int i) {
    //     return prize[i];
    // }

    public void addCredit(int n) {
        credit += n;
    }
    public void addTicket(int n) {
        ticket += n;
    }
    public void addPrize(String prize) {
        this.prize[prize_count] = prize;
    }
    public void subtractCredit(int n) {
        credit -= n;
    }
    public void subtractTicket(int n) {
        ticket -= n;
    }



}
