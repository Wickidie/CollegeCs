package stack;
import java.util.ArrayList;

public class Stack {
    private final int MAX_DATA;
    private int size = 0;
    Node head;
    

    Stack(int MAX_DATA){
        this.MAX_DATA = MAX_DATA;
        head = null;
    }

    // Push
    public void push(int num) {
        Node new_node = new Node(num);
        
        if (size >= MAX_DATA ) {
            System.out.println("FULLL");
        }else{
            if(head == null){
                head = new_node;
                size++;
            }else{
                new_node.next = head;
                head = new_node;
                size++;
            }
        }
    }
    
    // Pop
    public void pop() {
        Node new_node = new Node(0);

        if (head == null) {
            System.out.println("HAH??? KOSONG?? ASTAPIRULAH ALLASIM");
        }else{
            head = head.next;
            size--;
        }
    }

    // Pop Num
    public void popNum(int num) {
        if (head == null) {
            System.out.println("HAH??? KOSONG?? ASTAPIRULAH ALLASIM");
        }else{
            Node ptr = head;
            boolean found = false;
            Stack temp_stack = new Stack(size-1);

            // Push ke new stack (kecuali yg dicari)
            while (ptr.num != num) {
                System.out.println("POPPED" + ptr.num);
                temp_stack.push(ptr.num);
                pop();
                ptr = ptr.next;
            }
            
            // Pop yg dicari tapi gak di masukin ke temp_stack
            if (ptr.num == num) {
                    found = true;
            }
            System.out.println("POPPED" + ptr.num);
            pop();

            // Masukin kembali data dari temp_stack ke ori
            if (found) {
                while (temp_stack.head != null) {
                    System.out.println("PUSHED" + ptr.num);
                    push(temp_stack.head.num);
                    temp_stack.head = temp_stack.head.next;
                }
            }else{
                System.out.println("Not Found");
            }
        }
    }
    
    // Get Size
    public int getSize() {
        return size;
    }

    // Traverse
    public void traverse() {
        System.out.println();
        if (head != null) {
            Node ptr = head;

            do {
                System.out.println(ptr.num);
                ptr = ptr.next;
            } while (ptr != null);

        }else{
            System.out.println("HAH??? \" KOSONG?? ASTAPIRULAH ALLASIM");
        }
        System.out.println();
    }
    

}
