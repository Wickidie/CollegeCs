package ClassInteraction;

public class MahasiswaTester {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("a", 10);  
        Mahasiswa m2 = new Mahasiswa("b", 20); 
        Mahasiswa m3 = new Mahasiswa("c", 30);   
        Mahasiswa m4 = new Mahasiswa("d", 40);  
        Mahasiswa m5 = new Mahasiswa("e", 50);    
    
        Mahasiswa arr[] = {m1, m2, m3, m4, m5};

        System.out.println(PerhitunganNilai.rata2(arr));

    }
}
