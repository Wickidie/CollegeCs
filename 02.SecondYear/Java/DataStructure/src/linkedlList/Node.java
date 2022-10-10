package linkedlList;

public class Node {
    private int num;
    private Node ptrNextNode;

    Node(int num){
        this.num = num;
        ptrNextNode = null; 
    }

    public int getNum() {
        return num;
    }

    public void setNextNode(Node node) {
        ptrNextNode = node;
    }

    public Node getNextNode() {
        return ptrNextNode;
    }

}
