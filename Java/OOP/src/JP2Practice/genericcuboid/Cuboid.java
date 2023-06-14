package JP2Practice.genericcuboid;
import java.util.ArrayList;

public class Cuboid<T>{
    private ArrayList<T> arr = new ArrayList<T>();

    public void sort() {
        arr.sort(null);
    }

    public void add(T obj) {
    arr.add(obj);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < arr.size(); i++) {
            s += arr.get(i) + " ";
        }
        return s;
    }
}
