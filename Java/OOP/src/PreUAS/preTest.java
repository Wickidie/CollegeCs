package PreUAS;

public class preTest {
    public static void main(String[] args) {
        enumTest north = enumTest.NORTH;
        String dir = north.getCode();
        clasTest clas = new clasTest();

        System.out.println(clasTest.var1);

        System.out.println(enumTest.NORTH);
        System.out.println(enumTest.WEST);
        System.out.println(enumTest.SOUTH);
        System.out.println(enumTest.EAST);
        System.out.println(enumTest.values());
        System.out.println(north.getCode());
        System.out.println(dir);

        for (enumTest p : enumTest.values())
           System.out.println(p);


    }
}
