package kb3stack;
import java.util.ArrayList;

public class Stack {
    private final int MAX_DATA;
    private int size = 0;
    Node head;
    

    Stack(int MAX_DATA){
        this.MAX_DATA = MAX_DATA;
        head = null;
    }

    public void  reverse(String str) {
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            push(str.charAt(i));
            temp++;
        }
        traverse();
        for (int i = 0; i < temp; i++) {
            pop();
        }
    }
    public void  reverseOnSteroid(String str) {
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32) {
                traverse();
                for (int j = 0; j < temp; j++) {
                    pop();
                }
                temp = 0;
                System.out.print(" ");
            }else{
                push(str.charAt(i));
                temp++;
            }
        }
        traverse();
        for (int j = 0; j < temp; j++) {
            pop();
        }
    }

    // Push
    public void push(char ch) {
        Node new_node = new Node(ch);
        
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
        Node new_node = new Node('1');

        if (head == null) {
            System.out.println("HAH??? KOSONG?? ASTAPIRULAH ALLASIM");
        }else{
            head = head.next;
            size--;
        }
    }

    // Pop ch
    public void popch(char ch) {
        if (head == null) {
            System.out.println("HAH??? KOSONG?? ASTAPIRULAH ALLASIM");
        }else{
            Node ptr = head;
            boolean found = false;
            Stack temp_stack = new Stack(size-1);

            // Push ke new stack (kecuali yg dicari)
            while (ptr.ch != ch) {
                System.out.println("POPPED" + ptr.ch);
                temp_stack.push(ptr.ch);
                pop();
                ptr = ptr.next;
            }
            
            // Pop yg dicari tapi gak di masukin ke temp_stack
            if (ptr.ch == ch) {
                    found = true;
            }
            System.out.println("POPPED" + ptr.ch);
            pop();

            // Masukin kembali data dari temp_stack ke ori
            if (found) {
                while (temp_stack.head != null) {
                    System.out.println("PUSHED" + ptr.ch);
                    push(temp_stack.head.ch);
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
        if (head != null) {
            Node ptr = head;
            do {
                System.out.print(ptr.ch);
                ptr = ptr.next;
            } while (ptr != null);

        }else{
            System.out.println("HAH??? \" KOSONG?? ASTAPIRULAH ALLASIM");
        }
    }
    

}
