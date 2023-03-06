package linkedlList;

public class LinkedMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addTailNode(1);
        ll.printAddress();
        ll.printList();

        ll.addTailNode(2);
        ll.printAddress();
        ll.printList();

        ll.addTailNode(3);
        ll.printAddress();
        ll.printList();

        ll.addHeadNode(9);
        ll.printAddress();
        ll.printList();

        ll.addTailNode(8);
        ll.printAddress();
        ll.printList();
        /////
        ll.delHeadNode();
        ll.printAddress();
        ll.printList();
        
        ll.delTailNode();
        ll.printAddress();
        ll.printList();
        //////
        ll.addNodeAt(5, 2);
        ll.printAddress();
        ll.printList();
        
        ll.delNodeAt(2);
        ll.printAddress();
        ll.printList();
        
        ll.addNodeAt(6, 2);
        ll.printAddress();
        ll.printList();
        
        ll.delNodeNum(3);
        ll.printAddress();
        ll.printList();
        
    }
}
