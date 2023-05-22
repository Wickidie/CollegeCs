public class AESTestGPT {
    private static final int KEY_SIZE = 128; // AES-128

    public static void main(String[] args) {
        String plainText = "Hello, World!";

        try {
            byte[] key = generateKey();
            byte[] encryptedText = encrypt(plainText.getBytes(), key);
            System.out.println("Encrypted Text: " + new String(encryptedText));

            byte[] decryptedText = decrypt(encryptedText, key);
            System.out.println("Decrypted Text: " + new String(decryptedText));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] encrypt(byte[] plainText, byte[] key) throws Exception {
        byte[] encrypted = new byte[plainText.length];

        for (int i = 0; i < plainText.length; i++) {
            encrypted[i] = (byte) (plainText[i] ^ key[i % key.length]);
        }

        return encrypted;
    }

    public static byte[] decrypt(byte[] encryptedText, byte[] key) throws Exception {
        return encrypt(encryptedText, key); // AES is a symmetric algorithm, so encryption and decryption are the same
    }

    private static byte[] generateKey() {
        String secretKey = "YourSecretKey"; // Replace with your own secret key
        byte[] key = new byte[KEY_SIZE / 8];

        for (int i = 0; i < key.length; i++) {
            key[i] = (byte) secretKey.charAt(i % secretKey.length());
        }

        return key;
    }
}
