package linkedlList;

public class LinkedList {
    private Node head;
    private int size;

    public void printList() {
        Node tnode = head;
        // System.out.print("NULL");
        while (tnode != null) {
            System.out.print(tnode.getNum() + "-->");
            tnode = tnode.ptrNextNode;
        }
        System.out.print("NULL\n");
        System.out.println("===============");
    }

    public void printAddress(){
        // Node tnode = new Node(12);
        // tnode = head;

        // System.out.println("Head = " + head.getNum());
        // while (tnode != null) {
        //     System.out.println(tnode);
        //     tnode = tnode.ptrNextNode;
        // }
    }

    public void addHeadNode(int num) {
        Node new_node = new Node(num);
        new_node.ptrNextNode = head;
        head = new_node;
        size++;
    }
    
    public void addTailNode(int num) {
        Node new_node = new Node(num);
        Node last = head;

        if(head == null){
            head = new Node(num);
            return;
        }

        while (last.ptrNextNode != null) {
            last = last.ptrNextNode;
        }
        last.ptrNextNode = new_node;
        size++;
    }

    public void addNodeAt(int num, int pos) {
        if(head == null || pos <= 0){
            addHeadNode(num);
        }else if(pos > size){
            addTailNode(num);
        }else{
            Node tnode = new Node(12);
            Node prevNode = new Node(13);
            Node new_node = new Node(num);
            tnode = head;

            for (int i = 1; i < size; i++) {
                prevNode = tnode;
                tnode = tnode.ptrNextNode;
            }
            prevNode.ptrNextNode = new_node;
            new_node.ptrNextNode = tnode;
        }
        size++;
    }

    public void delHeadNode() {
        Node tnode = new Node(12);

        tnode = head;
        head = head.ptrNextNode;

        size--;
    }
    
    public void delTailNode() {
        Node tnode = new Node(12);
        Node prevNode = new Node(13);

        tnode = head;
        
        while (tnode.ptrNextNode != null) {
            prevNode = tnode;
            tnode = tnode.ptrNextNode;
        }
        prevNode.ptrNextNode = null;
        
        size--;
    }

    public void delNodeAt(int pos) {
        Node tnode = new Node(12);
        Node prevNode = new Node(13);
        tnode = head;

        for (int i = 1; i < pos; i++) {
            prevNode = tnode;
            tnode = tnode.ptrNextNode;
        }
        prevNode.ptrNextNode = tnode.ptrNextNode;
        size--;
    }

    public void delNodeNum(int num) {
        Node tnode = head;
        Node prevNode = head;
        boolean found = false;

        while (tnode.ptrNextNode != null) {
            if (tnode.getNum() == num) {
                found = true;
                break;
            }else{
                prevNode = tnode;
                tnode = tnode.ptrNextNode;
            }
        }
        if (found) {
            prevNode.ptrNextNode = tnode.ptrNextNode;
            size--;
        }else{
            System.out.println("NOT FOUND");
        }
    }

    public Node getHead() {
        return head;
    }
}
