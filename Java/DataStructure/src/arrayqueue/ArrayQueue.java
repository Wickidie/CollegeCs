package arrayqueue;

public class ArrayQueue {
    private int head;
    private int tail;
    private int size;
    private int queue[];

    ArrayQueue(int size){
        head = tail = 0;
        this.size = size;
        queue = new int[this.size];
    }

    public void enqueue(int num) {
        if (tail == size) {
            System.out.println("QQ");
        }else{
            queue[tail] = num;
            tail++;
            // System.out.println("UwU");
        }
        printDebug();
    }
    
    public void dequeue() {
        if (head == tail) {
            System.out.println("qq");
        }else{
            for (int i = 0; i < size-1; i++) {
                queue[i] = queue[i+1];
            }
            tail--;
            // System.out.println("OwO");
        }
        printDebug();
    }

    public void printAll() {
        if (head == tail) {
            System.out.print("XwX");
        }
        for (int i = head; i < tail; i++) {
            System.out.print(queue[i] + " ");
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
        System.out.print("DEBUG H/T/S: ");
        System.out.print(this.head + " ");
        System.out.print(this.tail + " ");
        System.out.print(this.size + " ");
        System.out.println();
    }

}
