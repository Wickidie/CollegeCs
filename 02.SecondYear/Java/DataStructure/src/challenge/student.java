package challenge;

public class student {
    private firstname fn;
    private lastname ln;

    student(firstname fns, lastname lns){
        fn = fns;
        ln = lns;
    }

    public void printName() {
        System.out.println(fn.getFn() + ln.getLn());
    }

}
