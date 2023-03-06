package QLL;

public class QNode {
    Book book;
    QNode ptrNextNode;

    QNode(Book book){
        this.book = book;
        ptrNextNode = null;
    }

    public Book getBook() {
        return book;
    }

}
