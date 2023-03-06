package kb3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class KB3_3{
    public static Student[] findStuName(Student arr[], String name) {
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getFirst_name().equalsIgnoreCase(name) || 
            arr[i].getLast_name().equalsIgnoreCase(name)) {
                num++;
            }
        }

        Student stuarr[] = new Student[num];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getFirst_name().equalsIgnoreCase(name) || 
            arr[i].getLast_name().equalsIgnoreCase(name)) {
                stuarr[i] = arr[i];
            }
        }
        if (num == 0) {
            return null;
        }else{
            return stuarr;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        Student stu[] = new Student[5];
        stu[0] = new Student("Ana", "Berlin");
        stu[1] = new Student("Cena", "Darling");
        stu[2] = new Student("Ebi", "Fern");
        stu[3] = new Student("Hana", "Indigo");
        stu[4] = new Student("Jerax", "Katom");

        // System.out.println(stu[0].getFirst_name());
        // System.out.println(stu[0].getLast_name());

        Student newstu[] = findStuName(stu, "berlin");
        System.out.println(findStuName(stu, "berlin"));

        // System.out.println(findStuName(stu, "Ana"));
        // System.out.println(newstu[0].getFirst_name());

        in.close();
    }
}
// NAMA    : Marvin Adinata
// NIM     : 312110009