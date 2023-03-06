// package doubleLL;

// public class NCircleDLLStudent {
//     private Node head;
//     // private Node tail;
//     private int MAXSIZE;

//     public void addFrontHead(Student stu) {
//         if (head == null) {
//             Node new_node = new Node(stu);
//             head = new_node;
//         }else{
//             Node new_node = new Node(stu);
//             new_node.next = head;
//             head.prev = new_node;
//             head = new_node;
//         }
//     }

//     public void addBackTail(Student stu) {
//         if (head == null) {
//             Node new_node = new Node(stu);
//             head = new_node;
//         }else{
//             Node new_node = new Node(stu);
//             Node ptr = head;
            
//             while(new_node.next != null){
//                 ptr = ptr.next;
//             }
//             ptr.next = new_node;
//             new_node.prev = ptr;
//         }
//     }


//     public void removeFrontHead() {
//         if (head == null) {
            
//         }else{
//             head = head.next;
//             head.prev = null;
//         }
//     }
//     public void removeBackTail() {
//         if (head == null) {
            
//         }else{
//             Node ptr = head;

//             while (ptr.next != null) {
//                 ptr = ptr.next;
//             }
//             ptr.prev.next = null;
//             ptr.prev = null;
//         }
//     }

//     public void printAllNodeFront() {
//         Node ptr = head;

//         if (head == null) {
            
//         }else{
//             do {
//                 System.out.print(ptr.stu + "->");
//                 ptr = ptr.next;
//             } while (ptr != null);
//         }
//         System.out.println();
//     }
//     public void printAllNodeBack() {
//         Node ptr = head;

//         if (head == null) {
            
//         }else{
//             do {
//                 ptr = ptr.next;
//             } while (ptr.next != null);
//             while (ptr != null) {
//                 System.out.print("<-" + ptr.stu);
//                 ptr = ptr.prev;
//             }
//         }
//         System.out.println();
//     }

// }
