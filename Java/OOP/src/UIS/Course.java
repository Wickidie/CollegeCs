public class Course {
    private static int cId = 1;
    private int id;
    private String name;
    private String schedule;
    private Lecturer lecturer;

    public Course(String name, String schedule) {
        this.id = cId++;
        this.name = name;
        this.schedule = schedule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Lecturer getLecturer(Lecturer lecturer) {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        String res = "";

        res += getId() + ",\t" + getName() + ",\t" + getSchedule() + " | " + getLecturer(lecturer);
        return res;
    }
}
