package kb2;

public class Node {
    public Game game;
    public Node next;

    public Node(Game game){
        this.game = game;
        next = null;
    }
}
