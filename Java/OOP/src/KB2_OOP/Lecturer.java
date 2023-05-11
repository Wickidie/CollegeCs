package KB2_OOP;

public class Lecturer {
    private static int current_lecturer = 0;
    private int id = 0;
    private String name;
    private Course teach[] = new Course[5];
    private int current_teach = 0;

    Lecturer(String name) {
        this.name = name;
        this.id = current_lecturer;
        current_lecturer++;
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

    public Course getTeachAt(int i) {
        return teach[i];
    }

    public Course[] getTeach() {
        return teach;
    }

    public void setTeach(Course course) {
        this.teach[current_teach] = course;
        current_teach++;
    }

    public int getCurrentTeach() {
        return current_teach;
    }

    public void setCurrentTeach(int current_teach) {
        this.current_teach = current_teach;
    }

    public static int getCurrentLecturer() {
        return current_lecturer;
    }

    public static void setCurrentLecturer(int current_lecturer) {
        Lecturer.current_lecturer = current_lecturer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrent_teach() {
        return current_teach;
    }

    public void setCurrent_teach(int current_teach) {
        this.current_teach = current_teach;
    }

}
