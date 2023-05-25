package JP2Practice.genericcuboid;

public class GenericMain {
    public static void main(String[] args) {
        Cuboid<Integer> cubeINT = new Cuboid<Integer>(10);
        Cuboid<String> cubeSTR = new Cuboid<String>(10);
        Cuboid<Double> cubeAGI = new Cuboid<Double>(10);


        cubeINT.add(10);
        cubeINT.add(52);
        cubeINT.add(7);
        cubeINT.sort();
        System.out.println(cubeINT);

    }
}
