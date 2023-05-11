package KB2_OOP;

public class Course {
    private static int current_course = 0;
    private int id = 0;
    private String name;
    private String schedule;
    private Lecturer lecturer[] = new Lecturer[10];
    private int current_lecturer;

    Course(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
        this.id = current_course;
        current_course++;
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

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Lecturer[] getLecturer() {
        return lecturer;
    }

    public Lecturer getLecturerAt(int i) {
        return lecturer[i];
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer[current_lecturer] = lecturer;
        current_lecturer++;
    }

    public static int getCurrentCourse() {
        return current_course;
    }

    public static void setCurrentCourse(int current_course) {
        Course.current_course = current_course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrent_lecturer() {
        return current_lecturer;
    }

    public void setCurrent_lecturer(int current_lecturer) {
        this.current_lecturer = current_lecturer;
    }

}
