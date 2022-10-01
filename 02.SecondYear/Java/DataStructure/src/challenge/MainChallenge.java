package challenge;

public class MainChallenge {
    public static void main(String[] args) {
        arraydata ad = new arraydata();

        ad.addData(new student(new firstname("Marvin"), new lastname("Adinata")));
        ad.printDataAt(0);
        ad.deleteDataAt(0);
        ad.printDataAt(0);

    }
}
