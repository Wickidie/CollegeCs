package tree;

public class Main {
    public static void main (String[] args) {
        BinaryTree BT = new BinaryTree();

        BT.insert(BT.root, 10);
        BT.insert(BT.root, 5);
        BT.insert(BT.root, 20);
        BT.insert(BT.root, 4);
        BT.insert(BT.root, 1);
        BT.insert(BT.root, 7);
        BT.insert(BT.root, 18);
        BT.insert(BT.root, 25);

        System.out.println(BT.inOrder());        
        System.out.println(BT.preOrder());        
        System.out.println(BT.postOrder()); 
        System.out.println();       

        System.out.println(BT.childOf(5));
        System.out.println(BT.descendantOf(5));
        System.out.println(BT.leaveOf(5));


      }
}
