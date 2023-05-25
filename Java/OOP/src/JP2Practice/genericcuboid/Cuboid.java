package JP2Practice.genericcuboid;
import java.util.Collections;


public class Cuboid<T>{
    private int MAX_SIZE = 10;
    private Object arr[];

    Cuboid(int n){
        arr = new Object[n];
    }

    public void sort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap strings[j] and strings[j + 1]
                    Object temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void add(T obj) {
        if (arr.length <= MAX_SIZE) {
            arr[arr.length] = obj;
        }
    }

    public Object[] getArr() {
        return arr;
    }

    public void setL(T arr[]) {
        this.arr = arr;
    }

}
