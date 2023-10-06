// name : Marvin Adinata
// date : 03 July 2023
// you do not have authority to change this file !!

public abstract class Person {
    private String fname;
    private String lname;

    Person(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }

    public String toString() {
        return fname + " " + lname;
    }
}
