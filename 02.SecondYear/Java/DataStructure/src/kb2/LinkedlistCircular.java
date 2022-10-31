package kb2;

public class LinkedlistCircular {
    private Node head;
    private Node tail;

    // Insert
    public void insert(Game game) {
        Node new_node = new Node(game);
        if (tail == null) {
            new_node.next = new_node;
            head = tail = new_node;
        }else{
            new_node.next = head;
            Node ptr = head;

            while (ptr.next != head) {
                ptr = ptr.next;
            }
            ptr.next = new_node;
        }
        System.out.println(game.getGame_title() + " = " + new_node);
    }
    
    // Remove
    public void remove() {
        if (head == null) {
        }else{
            Node ptr = head;
            
            while (ptr.next != head) {
                ptr = ptr.next;
            }
            head = head.next;
            ptr.next = head;
        }
    }

    // Traverse
    public void traverse() {
        System.out.println();
        System.out.println("(Current) -> (Next)");
        Node ptr = head;

        if(head != null){
            do{
                System.out.println(ptr.game.getGame_title() + " -> (" 
                + ptr.next.game.getGame_title() + ")" + ptr.next);
                ptr = ptr.next;
            }while(ptr != head);
        }
    }

    // Find
    public String find(String game_title) {
        System.out.println();
        Node ptr = head.next;
        boolean found = false;
        // System.out.println(ptr.next);
        do {
            if (ptr.next.game.getGame_title() == game_title) {
                found = true;
                break;
            }else{
                // System.out.println("From find" + ptr);
                ptr = ptr.next;
            }
        } while (ptr != head);

        if (found) {
            return "Found => " + ptr.next.game.getGame_title() + " - " +
            ptr.next.game.getPublisher() + " - " +
            ptr.next.game.getPrice();
        }else{
            return "err`` Not Found!";
        }
    }

    // Modify
    public boolean modify(String game_title, String new_game_title, String publisher, int price) {
        System.out.println();
        Node ptr = head.next;
        boolean found = false;

        do {
            if (ptr.next.game.getGame_title() == game_title) {
                found = true;
                break;
            }else{
                ptr = ptr.next;
            }
        } while (ptr != head);

        if (found) {
            ptr.next.game.setGameData(new_game_title, publisher, price);
            System.out.println("True - Modified");
        }else{
            System.out.println("False - Not Found");
        }

        return false;
    }

    // Debug
    public void debug() {
        // System.out.println(head);
    }
}
