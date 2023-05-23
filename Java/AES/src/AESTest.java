public class AESTest {
        public static void main(String[] args) {
                String b = "d4"; // b3

                System.out.println(rules02(b));
        }

        public static String rules02(String s) {
                String a = "1B";
                String res = "";
                String str = "";
                System.out.print(s.charAt(0));
                System.out.println(s.charAt(1));
                if (hexToBinary(s.charAt(0)) >= 8) {
                        for (int i = 0; i < 2; i++) {
                                if (hexToBinary(s.charAt(i)) >= 8) {
                                        res += Integer.toHexString((hexToBinary(s.charAt(i)) << 1) - 16);
                                }else{
                                        res += Integer.toHexString(hexToBinary(s.charAt(i)) << 1);
                                }
                        }
                        str += Integer.toHexString(hexToBinary(a.charAt(0)) ^ hexToBinary(res.charAt(0)));
                        str += Integer.toHexString(hexToBinary(a.charAt(1)) ^ hexToBinary(res.charAt(1)));
                }else{
                        return res;
                }
                return str;
        }

        public static int hexToBinary(char c) {
                return Character.digit(c, 16);
        }
}
