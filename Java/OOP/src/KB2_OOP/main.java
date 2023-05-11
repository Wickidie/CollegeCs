package KB2_OOP;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many lecture, student, and course?");
        int max_lecture = in.nextInt();
        int max_student = in.nextInt();
        int max_course = in.nextInt();
        Lecturer arr_lecture[] = new Lecturer[max_lecture];
        Student arr_student[] = new Student[max_student];
        Course arr_course[] = new Course[max_course];
        in.nextLine();

        int num = 0;
        do {
            System.out.println(printMenu());
            try {
                num = in.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong input");
            }
            getMenu(num, in, arr_lecture, arr_student, arr_course);
        } while (num >= 1 && num <= 10);

        in.close();
    }

    public static void addLecturer(Lecturer[] arr_lecturer, String name) {
        if (arr_lecturer[arr_lecturer.length - 1] == null) {
            arr_lecturer[Lecturer.getCurrentLecturer()] = new Lecturer(name);
        } else {
            System.out.println("Max lecturer");
        }
    }

    public static void addStudent(Student[] arr_student, String name) {
        if (arr_student[arr_student.length - 1] == null) {
            arr_student[Student.getCurrentStudent()] = new Student(name);
        } else {
            System.out.println("Max student");
        }
    }

    public static void addCourse(Course[] arr_course, String name, String schedule) {
        if (arr_course[arr_course.length - 1] == null) {
            arr_course[Course.getCurrentCourse()] = new Course(name, schedule);
        } else {
            System.out.println("Max course");
        }
    }

    public static void setCourse(Course course, Lecturer lecturer) {
        lecturer.setTeach(course);
        course.setLecturer(lecturer);
    }

    public static void takeCourse(Student student, Course course) {
        student.setLearn(course);
    }

    public static void removeCourse(Student student, int i) {
        student.removeLearn(i);
        ;
    }

    public static void setStudentState(Student student, boolean status) {
        student.setStatus(status);
    }

    public static void detailLecturers(Lecturer[] arr_lecturer) {
        try {
            System.out.println("\nShow All Lecturer");
            for (int i = 0; i < arr_lecturer.length; i++) {
                System.out.println("Lecturer ID = " + arr_lecturer[i].getId());
                System.out.println("Lecturer Name = " + arr_lecturer[i].getName());
                System.out.println("This lecturer teach :");
                for (int j = 0; j < Course.getCurrentCourse(); j++) {
                    try {
                        System.out.println("+ Course = " + arr_lecturer[i].getTeachAt(j).getName());
                        System.out.println("Schedule = " + arr_lecturer[i].getTeachAt(j).getSchedule());
                    } catch (Exception e) {
                        System.out.println(" - Available Course Slot");
                    }
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Null at DL");
        }
    }

    public static void detailStudents(Student[] arr_student) {
        try {
            System.out.println("\nShow All Student");
            for (int i = 0; i < arr_student.length; i++) {
                System.out.println("Student ID = " + arr_student[i].getId());
                System.out.println("Student Name = " + arr_student[i].getName());
                System.out.println("Student Status = " + arr_student[i].isStatus());
                System.out.println("This student is currently studying :");
                for (int j = 0; j < Course.getCurrentCourse(); j++) {
                    try {
                        System.out.println("+ Course ID = " + arr_student[i].getLearnAt(j).getId());
                        System.out.println("Course Name = " + arr_student[i].getLearnAt(j).getName());
                    } catch (Exception e) {
                        System.out.println(" - Available Course Slot");
                    }
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Null at DS");
        }
    }

    public static void detailCourses(Course[] arr_course) {
        try {
            System.out.println("\nShow All Course");
            for (int i = 0; i < arr_course.length; i++) {
                System.out.println("Course ID = " + arr_course[i].getId());
                System.out.println("Course Name = " + arr_course[i].getName());
                System.out.println("Course Schedule = " + arr_course[i].getSchedule());
                System.out.println("This Course is currently being teached by : ");
                for (int j = 0; j < Lecturer.getCurrentLecturer(); j++) {
                    try {
                        System.out.println("+ Lecturer Name = " + arr_course[i].getLecturerAt(j).getName());
                    } catch (Exception e) {
                        System.out.println(" - Available Lecturer Slot");
                    }
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Null at DC");
        }
    }

    public static void getMenu(int num, Scanner in, Lecturer[] arr_lecturer, Student[] arr_student,
            Course[] arr_course) {
        in.nextLine();
        String name;
        String schedule;
        int lecturer_id;
        int course_id;
        int student_id;
        boolean status = true;
        switch (num) {
            case 1:
                System.out.println("Lecturer name");
                name = in.nextLine();
                addLecturer(arr_lecturer, name);
                break;
            case 2:
                System.out.println("Student name");
                name = in.nextLine();
                addStudent(arr_student, name);
                break;
            case 3:
                System.out.println("Course name, Course schedule");
                name = in.nextLine();
                schedule = in.nextLine();
                addCourse(arr_course, name, schedule);
                break;
            case 4:
                detailLecturers(arr_lecturer);
                detailCourses(arr_course);
                System.out.println("Choose lecturer_id, course_id");
                lecturer_id = in.nextInt();
                course_id = in.nextInt();
                setCourse(arr_course[course_id], arr_lecturer[lecturer_id]);
                break;
            case 5:
                detailStudents(arr_student);
                detailCourses(arr_course);
                System.out.println("Choose student_id, course_id");
                student_id = in.nextInt();
                course_id = in.nextInt();
                removeCourse(arr_student[student_id], course_id);
                break;
            case 6:
                detailStudents(arr_student);
                System.out.println("Choose Student id, Set Student Status (type true or false, not 0 or 1)");
                student_id = in.nextInt();
                try {
                    status = in.nextBoolean();
                } catch (Exception e) {
                    System.out.println("(type true or false, not 0 or 1)");
                }
                setStudentState(arr_student[student_id], status);
                detailStudents(arr_student);
                break;
            case 7:
                detailLecturers(arr_lecturer);
                break;
            case 8:
                detailStudents(arr_student);
                break;
            case 9:
                detailCourses(arr_course);
                break;
            case 10:
                detailStudents(arr_student);
                detailCourses(arr_course);
                System.out.println("Choose Student id, Set Course id");
                student_id = in.nextInt();
                course_id = in.nextInt();
                takeCourse(arr_student[student_id], arr_course[course_id]);
                break;
            default:
                break;
        }
    }

    public static String printMenu() {
        String s = "\nMenu :\n"
                + "1. Add Lecturer\n"
                + "2. Add Student\n"
                + "3. Add Course\n"
                + "4. Set Course | Show All Lecturer | Show All Course\n"
                + "5. Remove Course | Show All Student | Show All Course Corresponding\n"
                + "6. Set Status | Show All Student\n"
                + "7. Detail Lecturer\n"
                + "8. Detail Student\n"
                + "9. Detail Course\n"
                + "10. Take Course | Show All Student | Show All Course\n"
                + "0. Exit\n";
        return s;
    }

}
