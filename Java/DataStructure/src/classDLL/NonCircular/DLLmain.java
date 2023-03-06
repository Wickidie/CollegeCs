package classDLL.NonCircular;
import java.util.Scanner;

public class DLLmain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        DLL dll = new DLL();

        dll.addFrontHead(new Student("AAA", "aaa", 1));
        dll.addFrontHead(new Student("BBB", "bbb", 1));
        dll.addFrontHead(new Student("CCC", "ccc", 1));
        dll.addFrontHead(new Student("DDD", "ddd", 1));
        dll.addFrontHead(new Student("EEE", "eee", 1));
        dll.printAllNodeFront();
        
        dll.removeFrontHead();
        dll.printAllNodeFront();

        dll.removeBackTail();
        dll.printAllNodeFront();
        
        dll.addBackTail(new Student("ZZZ", "zzz", 99));
        dll.printAllNodeFront();

        dll.printAllNodeBack();

        in.close();
    }
}
