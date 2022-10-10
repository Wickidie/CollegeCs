package linkedlList;

public class LinkedMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addNodeBack(1);
        ll.printAddress();
        ll.printList();

        ll.addNodeBack(2);
        ll.printAddress();
        ll.printList();

        ll.addNodeBack(3);
        ll.printAddress();
        ll.printList();

        ll.addNodeFront(9);
        ll.printAddress();
        ll.printList();

        ll.addNodeBack(8);
        ll.printAddress();
        ll.printList();

        ll.delFrontNode();
        ll.printAddress();
        ll.printList();
        



        
    }
}
