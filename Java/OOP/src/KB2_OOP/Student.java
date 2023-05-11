package KB2_OOP;

import java.util.Currency;

public class Student {
    private static int current_student = 0;
    private int id = 0;
    private String name;
    private Course learn[] = new Course[5];;
    private boolean status;
    private int current_course = 0;

    Student(String name) {
        this.name = name;
        this.id = current_student;
        this.status = true;
        current_student++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getLearn() {
        return learn;
    }

    public Course getLearnAt(int i) {
        return learn[i];
    }

    public void setLearn(Course learn) {
        this.learn[current_course] = learn;
        current_course++;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static int getCurrentStudent() {
        return current_student;
    }

    public static void setCurrentStudent(int current_student) {
        Student.current_student = current_student;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void removeLearn(int i) {
        learn[i] = null;
    }

}
