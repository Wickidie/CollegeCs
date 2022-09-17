package prgm8;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lab8 {
    public static void task1() {
        char charArray[] = { 'D', 'o', 'c', 't', 'o', 'r', ' ', 'S', 't', 'r', 'a', 'n', 'g', 'e' };
        String string = new String ( "Marvel Cinematic universe" );
        String s1 = new String();
        String s2 = new String ( string );
        String s3 = new String ( charArray );
        String s4 = new String ( charArray, 7, 7);
    
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
    public static void task2() {
        String s1 = new String ( "Hi there" );
        int stringLength = s1.length();
        char arrayCharacter[] = { 'D', 'o', 'c', 't', 'o', 'r', ' ', 'S', 't', 'r', 'a', 'n', 'g', 'e' };
        
        System.out.println(stringLength);
        System.out.println(arrayCharacter.length);

    }
    public static void task3() {
        String string = "Doctor Strange";
        char charArray[] = new char[7];

        System.out.println(charArray);
        string.getChars(0, 7, charArray, 0);
        System.out.println(string);

        System.out.println(charArray);

    }
    public static void task4() {
        String s1 = "abcdef";
        String s2 = "abcdef";
        String s3 = "qwerty";

        if (s1 == s2) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        if (s1.equals(s3)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        if (s1.compareTo(s2) == 0) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static void task5() {
        String string1="Welcome Home";
        String string2="Welcome home";

        System.out.println(string1.regionMatches(true, 8, string2, 8, 4));
    }
    public static void task6() {
        String str[] = {"Saya", "suka", "makan", "nasi", "goreng", "meskipun", 
        "makan", "nasi", "kuning", "terlihat", "lebih", "nikmat", "dari", "pada", 
        "nasi", "goreng", "tapi", "rasa", "nasi", "goreng", "tetap", "lebih", "nendang", 
        "garing", "dan", "itu", "7", "bintang", "buat", "saya"};
        int c=0;
        for(String content:str){
            if(content.startsWith("na")){
                System.out.println(content);
                System.out.println(content.startsWith("na"));
                c+=1;
            }
        }
        System.out.println(c);
    }
    public static void task7() {
        String s1 = 
        "adisucbawipuerbcqirubcvlsdjcgaliuzdcgaodisucg";
        String s2 = 
        "akljdclakjdbcalkjdbjbz;lkjahcjablcjkbljkzakljfbcvlakjbalkjz";
        String s3 =
        "jadi hari ini kita akan mencari solusi dari permasalahan yang terus menjadikan hambatan dari pekerjaan kita sehingga projek tidak jadi-jadi. untuk itu, supaya bisa segera jadi,kita harus segera menjadikan permasalahan ini dengan solusi yang sesuai";
        int sum = 0;

        System.out.println(s1.indexOf('z'));
        for (int i = 0; i < s2.length(); i++) {
            if (s2.indexOf('z', i) >= 0) {
                //System.out.println(s2.indexOf('z', i));
                i = s2.indexOf('z', i);
                sum++;
            }
        }
        System.out.println("Sum = " + sum);
        sum = 0;
        for (int i = 0; i < s3.length(); i++) {
            if (s3.indexOf("jadi", i) >= 0) {
                //System.out.println(s3.indexOf("jadi", i));
                i = s3.indexOf("jadi", i);
                sum++;
            }
        }
        System.out.println("Sum = " + sum);
    }
    public static void task8() {
        String letter = "Doctor Strange and the multiverse of madness"; 
        System.out.println(letter.substring(19));
        System.out.println(letter.substring(7, 14));
    }
    public static void task9() {
        String letter = "Scarlet Witch";

        System.out.println(letter.substring(8, 13) + ", "  + letter.substring(0, 7));
        System.out.println(letter.substring(8, 9) + ", "  + letter.substring(0, 7));
        System.out.println(letter.substring(8, 13) + ", "  + letter.substring(0, 1));
    }
    public static void task10() {
        Pattern pat = Pattern.compile("Marvin");
        Matcher mat = pat.matcher("Marvin");
        boolean matfound = mat.find();

        if (matfound) {
            System.out.println("Gotem");
        }else{
            System.out.println("Not Gotem");
        }
        
    }

    public static void main(String[] args) {
        
        task8();
        
    }
}
