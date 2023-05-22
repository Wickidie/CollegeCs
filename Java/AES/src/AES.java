
public class AES {
    public static void main(String[] args) {
        String[][] state = { { "32", "88", "31", "e0" },
                { "43", "5a", "31", "37" },
                { "f6", "30", "98", "07" },
                { "a8", "8d", "a2", "34" } };
        String[][] key = { { "2b", "28", "ab", "09" },
                { "7e", "ae", "f7", "ef" },
                { "15", "d2", "15", "4f" },
                { "16", "a6", "88", "3e" } };

        // test
        String s = "";
        byte[] b = s.getBytes();
        System.out.println(b)

        // cara run gimana? 
        // gabisa
        // kalok mau run coba chat atau run sendiri di local
    
    }

    // public static String hexToString() {

    // }

    public static String AddRoundKey(String[][] state, String[][] key) {
        Integer.to
        return state[0][0] ^ key[0][0];
    }

    public static void SubBytes() {

    }

    public static void ShiftRows() {

    }

    public static void MixColumns() {

    }

}

// Aldi
// Cevin
// Marvin
