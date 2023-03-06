package QLL;

public class QLinkedList {
    final int maxNode;
    private int currentNode;
    QNode head, tail;

    QLinkedList(int size){
        head = tail = null;
        this.maxNode = size;
    }

    public void enqueue(Book book){
        QNode new_node = new QNode(book);
        
        if (currentNode >= maxNode) {
            System.out.println("FULL");
            return;
        }

        if (tail == null) {
            head = tail = new_node;
            currentNode++;
        }else{
            tail.ptrNextNode = new_node;
            tail = new_node; 
            currentNode++;
        }
        // printDebug();
    }
    
    public void dequeue() {
        if (head == null) {
            System.out.println("EMPTY");
        }else{
            head = head.ptrNextNode;

            if (head == null) {
                tail = null;
            }
            currentNode--;
        }
        printQueue();
    }

    public void printQueue() {
        QNode temp = head;

        if (head == null) {
            System.out.println("EMPTY");
        }else{
            while (temp != null) {
                System.out.print(temp.getBook().getTitle() + " -> ");
                temp = temp.ptrNextNode;
            }
        }
        System.out.println();
    }

    public void printDebug() {
        System.out.print("Debug H/T/CN: ");
        System.out.print(head.getBook().getTitle() + " ");
        System.out.print(tail.getBook().getTitle() + " ");
        System.out.print(currentNode + " ");
        System.out.println();
    }
}
