package arrayqueue;

public class Queue {
    private int head;
    private int tail;
    private int size;
    private int queue[];

    Queue(int size){
        head = tail = 0;
        queue = new int[size];
    }

    public int wrapAround() {
        return 0;
    }

    public void enqueue(int num) {
        tail++;
        size++;
        
        printDebug();
    }
    
    public void dequeue() {
        size--;
        head++;

        printDebug();
    }

    public void printAll() {
        int ptr = head+1;
        
        for (int i = 0; i < size; i++) {
            
        }

        System.out.println();
    }

    public void printInSize() {
        for (int i = head; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public void printDebug() {
        System.out.print("DEBUG H/T/S/QL: ");
        System.out.print(this.head + " ");
        System.out.print(this.tail + " ");
        System.out.print(this.size + " ");
        System.out.print(queue.length + " ");
        System.out.println();
    }
}
