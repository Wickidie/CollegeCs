package ClassInteraction;

public class PerhitunganNilai {
    public static double rata2(Mahasiswa arr[]) {
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i].getNilai();   
        }
        avg /= arr.length;
        return avg;
    }

}
