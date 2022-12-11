package uassmt3;

public class Node {
    private int num;
    Node ptrNextNode;

    Node(int num){
        this.num = num;
        ptrNextNode = null; 
    }

    public int getNum() {
        return num;
    }
}
