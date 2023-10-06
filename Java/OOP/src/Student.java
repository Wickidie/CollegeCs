// date : 03 July 2023
// name : Marvin Adinata

public class Student extends Person {
    private Date bornDate;
    private String id;
    private Major major;

    // id = 2 chars fname + 2 chars lname + dd + mm + yy + major
    // score = 10
    public Student(String fn, String ln, int d, int m, int y, Major mj) {
        super(fn, ln);
        bornDate = setDate(d, m, y);
        id = fn.substring(0, 2) + ln.substring(0, 2);
        this.major = mj;
    }

    // called in constructor
    // score = 20
    public Date setDate(int d, int m, int y) {
        return new Date(d, m, y);
    }

    // will output = id + ":" + first name + last name + ":" + bornDate + ":" + major
    // LoIr23011988:Lockey Irawan:23/01/1988:Information Technology
    // score : 20
    public String toString() {
        return new String(id + bornDate.getDay() + bornDate.getMonth() + bornDate.getYear()
                        + ":" + super.toString()
                        + ":" + bornDate)
                        + ":" + major.getName();
    }
}
