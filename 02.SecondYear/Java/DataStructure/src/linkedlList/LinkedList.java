package linkedlList;

public class LinkedList {
    private Node head;
    private int size;

    public void printList() {
        Node tnode = head;
        System.out.print("NULL");
        while (tnode != null) {
            System.out.print("<-" + tnode.getNum());
            tnode = tnode.getNextNode();
        }
        System.out.println();
    }

    public void printAddress(){
        System.out.println(head.getNum());
        System.out.println(head);
        System.out.println(head.getNextNode());
    }

    public void addNodeFront(int num) {
        Node new_node = new Node(num);
        new_node.setNextNode(head);
        head = new_node;
        size++;
    }
    
    public void addNodeBack(int num) {
        Node new_node = new Node(num);
        Node last = head;

        if(head == null){
            head = new Node(num);
            return;
        }

        while (last.getNextNode() != null) {
            last = last.getNextNode();
        }
        last.setNextNode(new_node);
        size++;
    }

    public void delFrontNode() {
        Node tnode = new Node(12);

        tnode = head;
        head = head.getNextNode();

        size--;
    }

    public Node getHead() {
        return head;
    }

}
