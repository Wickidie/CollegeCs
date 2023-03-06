package challenge;

import java.util.ArrayList;

import kb3.Student;

public class arraydata {
    ArrayList<student> al = new ArrayList<>();

    public void addData(student stdn) {
        al.add(stdn);
    }

    public void printDataAt(int index) {
        if (al.size() <= 0) {
            System.out.println("Data Kosong");
        }else{
            al.get(index).printName();
        }
    }

    public void deleteDataAt(int index) {
        if (al.size() <= 0) {
            System.out.println("Data Kosong");
        }else{
            al.remove(index);
        }
    }

}
