package kb1;

public class Item {
    private int pid;
    private int n;
    private int total;
    private String name;

    Item(int pid, int n, int total, String name){
        this.pid = pid;
        this.n = n;
        this.total = total;
        this.name = name;
    }

    public int getN() {
        return n;
    }
    public int getTotal() {
        return total;
    }

}
