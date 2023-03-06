package kb2;

public class Game {
    private String game_title;
    private String publisher;
    private int price;

    Game(String game_title, String publisher, int price){
        this.game_title = game_title;
        this.publisher = publisher;
        this.price = price;
    }

    public String getGame_title() {
        return game_title;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getPrice() {
        return price;
    }

    public void setGameData(String game_title, String publisher, int price){
        this.game_title = game_title;
        this.publisher = publisher;
        this.price = price;
    }

}
