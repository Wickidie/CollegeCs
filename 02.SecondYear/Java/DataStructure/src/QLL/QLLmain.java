package QLL;

public class QLLmain {
    public static void main(String[] args) {
        QLinkedList QLL = new QLinkedList(5);

        QLL.enqueue(new Book("Buku_1", "Fuk11"));
        QLL.enqueue(new Book("Buku_2", "Fuk22"));
        QLL.enqueue(new Book("Buku_3", "Fuk33"));
        QLL.enqueue(new Book("Buku_4", "Fuk44"));
        QLL.enqueue(new Book("Buku_5", "Fuk55"));
        QLL.enqueue(new Book("Buku_6", "Fuk66"));
        
        QLL.printQueue();
        
        QLL.dequeue();
        QLL.dequeue();
        QLL.dequeue();
        QLL.dequeue();
        QLL.dequeue();
        QLL.dequeue();
        
        // QLL.enqueue(new Book("How to 1", "Fuk11"));
        // QLL.enqueue(new Book("How to 2", "Fuk22"));
        // QLL.enqueue(new Book("How to 3", "Fuk33"));
        // QLL.enqueue(new Book("How to 4", "Fuk44"));
        // QLL.enqueue(new Book("How to 5", "Fuk55"));



    }
}
