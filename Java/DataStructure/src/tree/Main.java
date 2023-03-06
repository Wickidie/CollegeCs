package tree;

public class Main {
    public static void main (String[] args) {
        BinaryTree BT = new BinaryTree();

        // BT.insert(BT.root, 57);
        // BT.insert(BT.root, 43);
        // BT.insert(BT.root, 98);
        // BT.insert(BT.root, 21);
        // BT.insert(BT.root, 51);
        // BT.insert(BT.root, 72);
        // BT.insert(BT.root, 102);
        // BT.insert(BT.root, 19);
        // BT.insert(BT.root, 45);
        // BT.insert(BT.root, 63);
        // BT.insert(BT.root, 199);
        // BT.insert(BT.root, 50);
        // BT.insert(BT.root, 155);
        // BT.insert(BT.root, 201);
        // BT.insert(BT.root, 143);
        // BT.insert(BT.root, 166);
        // BT.insert(BT.root, 111);

        BT.insert(BT.root, 'V');
        BT.insert(BT.root, 'A');
        BT.insert(BT.root, 'S');
        BT.insert(BT.root, 'S');
        BT.insert(BT.root, 'I');
        BT.insert(BT.root, 'L');
        BT.insert(BT.root, 'I');
        BT.insert(BT.root, 'S');
        BT.insert(BT.root, 'S');
        BT.insert(BT.root, 'A');

        System.out.println(BT.inOrder());        
        System.out.println(BT.preOrder());   
        System.out.println(BT.postOrder());

        // BT.deleteNode(BT.root, 199);
        // System.out.println();

        // System.out.println(BT.inOrder());        
        // System.out.println(BT.preOrder());   
        // System.out.println(BT.postOrder());


      }
}
