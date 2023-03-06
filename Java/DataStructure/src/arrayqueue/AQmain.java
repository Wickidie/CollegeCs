package arrayqueue;

public class AQmain {
    public static void main(String[] args) {
        // ArrayQueue AQ = new ArrayQueue(5);

        // AQ.printAll();
        // AQ.printInSize();
        // AQ.printDebug();
        // //        
        // AQ.enqueue(9);
        // AQ.enqueue(8);
        // AQ.enqueue(88);
        // AQ.enqueue(88);
        // AQ.enqueue(88);
        // AQ.enqueue(99);
        // AQ.printAll();
        // //
        // System.out.println("===");
        // AQ.dequeue();
        // AQ.printAll();
        // AQ.printInSize();
        
        // AQ.dequeue();
        // AQ.printAll();
        // AQ.printInSize();
        
        // AQ.dequeue();
        // AQ.printAll();
        // AQ.printInSize();
        
        // AQ.dequeue();
        // AQ.printAll();
        // AQ.printInSize();
        
        // AQ.dequeue();
        // AQ.printAll();
        // AQ.printInSize();
        
        // AQ.dequeue();
        // AQ.printAll();
        // AQ.printInSize();

        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        
        q.printAll();
        q.printInSize();
        //
        q.dequeue();
        q.dequeue();
        q.dequeue();
        
        q.printAll();
        q.printInSize();

    }
}