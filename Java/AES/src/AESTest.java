public class AESTest {
        public static void main(String[] args) {
                String b = "d4"; // b3

                System.out.println(Integer.parseInt(b, 16));
                System.out.println(Integer.parseInt(b, 16) << 1);
                System.out.println(Integer.toHexString(Integer.parseInt(b, 16) << 1));
                System.out.println(rules02(b));
        }

        public static String rules02(String s) {
                String a = "1B";
                String res = "";
                        if (hexToBinary(s.charAt(0)) >= 8) {
                                res = Integer.toHexString(((Integer.parseInt(s, 16) << 1) - 256));
                                return Integer.toHexString(hexToBinary(a.charAt(0)) ^ hexToBinary(res.charAt(0))) 
                                        + Integer.toHexString(hexToBinary(a.charAt(1)) ^ hexToBinary(res.charAt(1)));
                        }else{
                                return s;
                        }
        }

        public static int hexToBinary(char c) {
                return Character.digit(c, 16);
        }
}
