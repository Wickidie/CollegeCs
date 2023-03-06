package classDLL.NonCircular;

public class DLL {
    private Node head;
    // private int MAXSIZE;

    // Add
    public void addFrontHead(Student stu) {
        if (head == null) {
            Node new_node = new Node(stu);
            head = new_node;
        }else{
            Node new_node = new Node(stu);
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
        }
    }
    public void addBackTail(Student stu) {
        if (head == null) {
            Node new_node = new Node(stu);
            head = new_node;
        }else{
            Node ptr = head;
            Node new_node = new Node(stu);
            
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = new_node;
            new_node.prev = ptr;
        }
    }
    
    // Remove
    public void removeFrontHead() {
        if (head == null) {
            
        }else{
            head = head.next;
            head.prev = null;
        }
    }
    public void removeBackTail() {
        if (head == null) {
            
        }else{
            Node ptr = head;

            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.prev.next = null;
            ptr.prev = null;
        }
    }
    // Print
    public void printAllNodeFront() {
        Node ptr = head;

        if (head == null) {
            
        }else{
            do {
                System.out.print(ptr.stu.getFull_name() + "->");
                ptr = ptr.next;
            } while (ptr != null);
        }
        System.out.println();
    }
    public void printAllNodeBack() {
        Node ptr = head;

        if (head == null) {
            
        }else{
            do {
                ptr = ptr.next;
            } while (ptr.next != null);
            while (ptr != null) {
                System.out.print("<-" + ptr.stu.getFull_name());
                ptr = ptr.prev;
            }
        }
        System.out.println();
    }
}
