public class StudentKB2 {
    private static int stuId = 1;
    private int id;
    private String name;
    private Course learn[];
    private Boolean status;

    public StudentKB2(String name) {
        this.id = stuId++;
        this.name = name;
        this.status = true;
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

    public Course[] getLearn() {
        return learn;
    }

    public void setLearn(Course[] learn) {
        this.learn = learn;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String status = getStatus() ? "Active" : "Inactive";
        String res = "";

        res += getId() + "\t" + getName() + "\t" + status;
        return res;
    }
    
}
