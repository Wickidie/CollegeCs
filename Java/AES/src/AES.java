
public class AES {
    public static void main(String[] args) {

        String[][] sBox = {
                { "63", "7C", "77", "7B", "F2", "6B", "6F", "C5", "30", "01", "67", "2B", "FE", "D7", "AB", "76" },
                { "CA", "82", "C9", "7D", "FA", "59", "47", "F0", "AD", "D4", "A2", "AF", "9C", "A4", "72", "C0" },
                { "B7", "FD", "93", "26", "36", "3F", "F7", "CC", "34", "A5", "E5", "F1", "71", "D8", "31", "15" },
                { "04", "C7", "23", "C3", "18", "96", "05", "9A", "07", "12", "80", "E2", "EB", "27", "B2", "75" },
                { "09", "83", "2C", "1A", "1B", "6E", "5A", "A0", "52", "3B", "D6", "B3", "29", "E3", "2F", "84" },
                { "53", "D1", "00", "ED", "20", "FC", "B1", "5B", "6A", "CB", "BE", "39", "4A", "4C", "58", "CF" },
                { "D0", "EF", "AA", "FB", "43", "4D", "33", "85", "45", "F9", "02", "7F", "50", "3C", "9F", "A8" },
                { "51", "A3", "40", "8F", "92", "9D", "38", "F5", "BC", "B6", "DA", "21", "10", "FF", "F3", "D2" },
                { "CD", "0C", "13", "EC", "5F", "97", "44", "17", "C4", "A7", "7E", "3D", "64", "5D", "19", "73" },
                { "60", "81", "4F", "DC", "22", "2A", "90", "88", "46", "EE", "B8", "14", "DE", "5E", "0B", "DB" },
                { "E0", "32", "3A", "0A", "49", "06", "24", "5C", "C2", "D3", "AC", "62", "91", "95", "E4", "79" },
                { "E7", "C8", "37", "6D", "8D", "D5", "4E", "A9", "6C", "56", "F4", "EA", "65", "7A", "AE", "08" },
                { "BA", "78", "25", "2E", "1C", "A6", "B4", "C6", "E8", "DD", "74", "1F", "4B", "BD", "8B", "8A" },
                { "70", "3E", "B5", "66", "48", "03", "F6", "0E", "61", "35", "57", "B9", "86", "C1", "1D", "9E" },
                { "E1", "F8", "98", "11", "69", "D9", "8E", "94", "9B", "1E", "87", "E9", "CE", "55", "28", "DF" },
                { "8C", "A1", "89", "0D", "BF", "E6", "42", "68", "41", "99", "2D", "0F", "B0", "54", "BB", "16" }
        };
        String[][] state = { 
                { "32", "88", "31", "e0" },
                { "43", "5a", "31", "37" },
                { "f6", "30", "98", "07" },
                { "a8", "8d", "a2", "34" } };
        String[][] key = { 
                { "2b", "28", "ab", "09" },
                { "7e", "ae", "f7", "cf" },
                { "15", "d2", "15", "4f" },
                { "16", "a6", "88", "3c" } };

        String[][] round_keyed = addRoundKey(state, key);
        String[][] subyted = subBytes(round_keyed, sBox);
        String[][] shift_rowed = shiftRows(subyted);
        String[][] mix_columned = mixColumns(shift_rowed);

    }

    public static int hexToBinary(char c) {
        return Character.digit(c, 16);
    }
    
    public static void printArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("\n");
    }

    public static String[][] addRoundKey(String[][] state, String[][] key) {
        String[][] res = { 
                { "", "", "", "" },
                { "", "", "", "" },
                { "", "", "", "" },
                { "", "", "", "" } };
        int a = 0, b = 0;
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < key.length; j++) {
                a = hexToBinary(state[i][j].charAt(0));
                b = hexToBinary(key[i][j].charAt(0));
                res[i][j] = Integer.toHexString(a ^ b);
                a = hexToBinary(state[i][j].charAt(1));
                b = hexToBinary(key[i][j].charAt(1));
                res[i][j] += "" + Integer.toHexString(a ^ b);
            }
        }
        System.out.print("Hasil AddRoundKey : ");
        printArr(res);
        return res;
    }

    public static String[][] subBytes(String[][] arr, String[][] sbox) {
        String[][] res = { 
                { "", "", "", "" },
                { "", "", "", "" },
                { "", "", "", "" },
                { "", "", "", "" } };

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                res[i][j] = sbox[hexToBinary(arr[i][j].charAt(0))][hexToBinary(arr[i][j].charAt(1))];
            }
        }
        System.out.print("Hasil SubBytes (sbox) : ");
        printArr(arr);
        return res;
    }

    public static String[][] shiftRows(String[][] state) {
        String[][] res = { 
                { "", "", "", "" },
                { "", "", "", "" },
                { "", "", "", "" },
                { "", "", "", "" } };
        for (int i = 0; i < state.length; i++) {
            switch (i) {
                case 0:
                    for (int j = 0; j < state.length; j++) {
                        res[i][j] = state[i][j];
                    }
                    break;
                case 1:
                    res[i][0] = state[i][1];
                    res[i][1] = state[i][2];
                    res[i][2] = state[i][3];
                    res[i][3] = state[i][0];
                    break;
                case 2:
                    res[i][0] = state[i][2];
                    res[i][1] = state[i][3];
                    res[i][2] = state[i][0];
                    res[i][3] = state[i][1];
                    break;
                case 3:
                    res[i][0] = state[i][3];
                    res[i][1] = state[i][0];
                    res[i][2] = state[i][1];
                    res[i][3] = state[i][2];
                    break;
            };
        }
        System.out.print("Hasil Shift Rows : ");
        printArr(res);
        return res;
    }

    public static String[][] mixColumns(String[][] arr) {
        String[][] res = { 
            { "", "", "", "" },
            { "", "", "", "" },
            { "", "", "", "" },
            { "", "", "", "" } };
        String[][] polinom = { 
            { "02", "03", "01", "01" },
            { "01", "02", "03", "01" },
            { "01", "01", "02", "03" },
            { "03", "01", "01", "02" } };

        for (int i = 0; i < arr.length; i++) {
            String[][] mx = { 
                { "", "", "", "" },
                { "", "", "", "" },
                { "", "", "", "" },
                { "", "", "", "" } };

            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    switch (polinom[j][k]) {
                        case "01":
                            mx[k][j] = arr[i][k];
                        break;
                        case "02":
                            mx[k][j] = rules02(arr[i][k]);
                        break;
                        case "03":
                            String temp = rules02(arr[i][k]);
                            mx[k][j] += Integer.toHexString(hexToBinary(arr[i][k].charAt(0)) ^ 
                                                            hexToBinary(temp.charAt(0)));
                            mx[k][j] += Integer.toHexString(hexToBinary(arr[i][k].charAt(1)) ^ 
                                                            hexToBinary(temp.charAt(1)));
                        break;
                        default:
                            break;
                    }
                }
            }
            printArr(mx);

            for (int j = 0; j < arr.length; j++) {
                res[j][i] += Integer.toHexString(
                            hexToBinary(mx[0][j].charAt(0)) ^
                            hexToBinary(mx[1][j].charAt(0)) ^
                            hexToBinary(mx[2][j].charAt(0)) ^
                            hexToBinary(mx[3][j].charAt(0)));
                res[j][i] += Integer.toHexString(
                            hexToBinary(mx[0][j].charAt(1)) ^
                            hexToBinary(mx[1][j].charAt(1)) ^
                            hexToBinary(mx[2][j].charAt(1)) ^
                            hexToBinary(mx[3][j].charAt(1)));
            }
        }

        System.out.print("Hasil Mix Columns : ");
        printArr(res);
        return res; 
    }

    public static String rules02(String s) {
        String a = "1B";
        String res = "";
        String str = "";
        // System.out.print(s.charAt(0));
        // System.out.println(s.charAt(1));
        for (int i = 0; i < 2; i++) {
            if (hexToBinary(s.charAt(i)) >= 8) {
                res += Integer.toHexString((hexToBinary(s.charAt(i)) << 1) - 16);
            }else{
                res += Integer.toHexString(hexToBinary(s.charAt(i)) << 1);
            }
        }
        if (hexToBinary(s.charAt(0)) >= 8) {
            str += Integer.toHexString(hexToBinary(a.charAt(0)) ^ hexToBinary(res.charAt(0)));
            str += Integer.toHexString(hexToBinary(a.charAt(1)) ^ hexToBinary(res.charAt(1)));
        }else{
            return res;
        }
        return str;
    }

}

// Aldi
// Cevin
// Marvin
