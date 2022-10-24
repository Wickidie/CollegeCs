package classDLL.Circular;

public class Student {
    private String first_name;
    private String last_name;
    private int age;

    public Student(String f, String l, int age){
        first_name = f;
        last_name = l;
        this.age = age;
    }

    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getFull_name() {
        return first_name+last_name;
    }

}
