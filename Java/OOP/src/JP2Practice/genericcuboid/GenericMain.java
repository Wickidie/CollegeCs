// package JP2Practice.genericcuboid;

public class GenericMain {
    public static void main(String[] args) {
        Cuboid<Integer> cubeINT = new Cuboid<Integer>();
        Cuboid<String> cubeSTR = new Cuboid<String>();
        Cuboid<Double> cubeAGI = new Cuboid<Double>();

        cubeINT.add(10);
        cubeINT.add(52);
        cubeINT.add(7);
        cubeINT.sort();
        System.out.println(cubeINT);
        
        cubeSTR.add("pAPA");
        cubeSTR.add("Sista");
        cubeSTR.add("MAMA");
        cubeSTR.sort();
        System.out.println(cubeSTR);

        cubeAGI.add(12.21);
        cubeAGI.add(4.20);
        cubeAGI.add(9.11);
        cubeAGI.sort();
        System.out.println(cubeAGI);
    }
}
