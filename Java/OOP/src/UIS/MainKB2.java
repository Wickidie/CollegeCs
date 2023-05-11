import java.util.Scanner;

public class MainKB2 {

    public static int counterLecturer = 0;
    public static int counterStudent = 0;
    public static int counterCourse = 0;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Lecturer lect[] = new Lecturer[5];
        StudentKB2 stu[] = new StudentKB2[5];
        Course c[] = new Course[5];

        // addLecturer(lect, in);
        int menuChoice;
        do {
            menuChoice = getMenuOption(in);
            executeMenuChoice(menuChoice, lect, stu, c, in);
        } while (menuChoice != 0);

    }

    public static Lecturer addLecturer(Lecturer[] lect, Scanner in) {
        
        in.nextLine();
        System.out.print("Enter lecturer's name : ");
        String name = in.nextLine();
        // System.out.println("1");
        Lecturer l = new Lecturer(name);

        lect[counterLecturer++] = l; 

        return l;
    }

    public static StudentKB2 addStudent(StudentKB2[] stu, Scanner in) {
        
        in.nextLine();
        System.out.print("Enter student's name : ");
        String name = in.nextLine();
        StudentKB2 s = new StudentKB2(name);

        stu[counterStudent++] = s;

        return s;
    }

    public static Course addCourse(Course[] c, Scanner in) {

        in.nextLine();
        System.out.print("Enter course's name : ");
        String name = in.nextLine();
        System.out.print("Enter course's schedule : ");
        String schedule = in.nextLine();

        Course course = new Course(name, schedule);

        c[counterCourse++] = course;

        return course;
    }

    public static void setCourse(Course course, Lecturer lecturer) {
        // System.out.print("Enter course's ID : ");
        // int course_id = in.nextInt();
        course.setLecturer(lecturer);
        lecturer.setTeach(course);
    }

    public static void takeCourse(StudentKB2 student, Course course) {

    }

    public static void removeCourse(StudentKB2 student, Course course) {

    }

    public static void detailLecturer(Lecturer lecturer) {
        
    }

    public static void detailStudent(StudentKB2 student) {

    }

    public static void setStudentState(StudentKB2 student, boolean state) {

    }

    public static void detailLecturers(Lecturer[] lect) {
        for (Lecturer l : lect) {
            if (l != null) {
                System.out.println(l);
            }
        }
    }

    public static void detailStudents(StudentKB2[] student) {
        for (StudentKB2 stu : student) {
            if (stu != null) {
                System.out.println(stu);
            }
        }

    }

    public static void detailCourses(Course[] course) {
        for (Course c : course) {
            if (c != null) {
                System.out.println(c);
            }
        }

    }

    public static int getMenuOption(Scanner in) {
        int opt = -1;

        System.out.println("1. Add Lecturer");
        System.out.println("2. Add Student");
        System.out.println("3. Add Course");
        System.out.println("4. Set Course | Show All Student | Show All Course");
        System.out.println("5. Take Course");
        System.out.println("6. Remove Course | Show All Student | Show All Course Corresponding");
        System.out.println("7. Set Status | Show All Student");
        System.out.println("8. Detail Lecturer");
        System.out.println("9. Detail Student");
        System.out.println("10. Detail Course");
        System.out.println("0. Exit");

        while (true) {
            try {
                System.out.println("Please enter option (0-10): ");
                opt = in.nextInt();
            } catch (Exception e) {
                System.out.println("err : " + e);
                in.nextLine();
            }

            if (opt >= 0 && opt <= 10) {
                break;
            }
        }
        return opt;

    }

    
    public static int lecturer_id = -1;
    public static int student_id = -1;
    public static int course_id = -1;

    public static void executeMenuChoice(int menuChoice, Lecturer[] l, StudentKB2[] stu, Course[] c, Scanner in) {

        switch (menuChoice) {
            case 0: break;
            case 1: addLecturer(l, in);
                    break;
            case 2: addStudent(stu, in);
                    break;
            case 3: addCourse(c, in);
                    break;
            case 4: detailCourses(c);
                    System.out.print("Enter course's ID : ");
                    course_id = in.nextInt();
                    System.out.print("Enter lecturer's ID : ");
                    lecturer_id = in.nextInt();
                    setCourse(c[course_id], l[lecturer_id]);
                    break;
            case 5: break;
            case 6: break;
            case 7: 
                    break;
            case 8: detailLecturers(l);
                    break;
            case 9: detailStudents(stu);
                    break;
            case 10:detailCourses(c); 
                    break;
        }
    }
}
