public class Lecturer {
    public static int lId = 1;
    private int id;
    private String name;
    private Course teach[] = new Course[10];
    private static int numTeached = 0;

    public Lecturer(String name) {
        this.id = lId++;
        this.name = name;
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

    public Course[] getTeach() {
        return teach;
    }

    public void setTeach(Course[] teach) {
        this.teach = teach;
    }

    public void setTeach(Course course) {
        this.teach[numTeached] = course;
        numTeached++;
    }

    public void teach() {
        System.out.print(getId() + " " + getName() + "\n"
                + getTeach() + ", ");
    }

    @Override
    public String toString() {
        String res = "";

        res += getId() + "\t" + getName();
        return res;
    }

}
