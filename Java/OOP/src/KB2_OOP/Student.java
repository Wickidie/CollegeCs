package KB2_OOP;

public class Student {
    private static int current_student = 0;
    private int id = 0;
    private String name;
    private Course learn[] = new Course[10];
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

    public void setLearn(Course learn) {
        for (int i = 0; i < Course.getCurrentCourse(); i++) {
            if (this.learn[i] == null) {
                this.learn[i] = learn;
                current_course++;
                break;
            }
            if (i == Course.getCurrentCourse() - 1) {
                System.out.println("Cant take anymore Course");
                break;
            }
        }
    }

    public void removeLearn(int course_id) {
        for (int i = 0; i < learn.length; i++) {
            try {
                if (learn[i].getId() == course_id) {
                    learn[i] = null;
                    current_course--;
                    break;
                } else {
                    System.out.println("Course id " + course_id + " Cant be found");
                }
            } catch (Exception e) {
            }

        }
    }

}
