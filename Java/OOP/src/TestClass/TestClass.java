package TestClass;

public class TestClass {
    static int count;
    int x;
    int y;

    TestClass(int x, int y){
        System.out.println(this);
        count++;
    }

    public TestClass printTC(TestClass TC) {
        return staticPrintTC(TC);
    }
    
    public static TestClass staticPrintTC(TestClass TC) {
        return TC;
    }
}
