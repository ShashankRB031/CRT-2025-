import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEncryptionWithInput {

    // Encrypt using Caesar Cipher logic and a Queue
    public static Queue<Character> encrypt(String message, int shift) {
        Queue<Character> encryptedQueue = new LinkedList<>();

        for (char ch : message.toCharArray()) {
            char encryptedChar = (char) (ch + shift);
            encryptedQueue.add(encryptedChar);
        }

        return encryptedQueue;
    }

    // Decrypt from the Queue
    public static String decrypt(Queue<Character> encryptedQueue, int shift) {
        StringBuilder decryptedMessage = new StringBuilder();

        while (!encryptedQueue.isEmpty()) {
            char decryptedChar = (char) (encryptedQueue.poll() - shift);
            decryptedMessage.append(decryptedChar);
        }

        return decryptedMessage.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking message input
        System.out.print("Enter the message to encrypt: ");
        String message = scanner.nextLine();

        // Taking shift value input
        System.out.print("Enter shift value for encryption: ");
        int shift = scanner.nextInt();

        // Encryption
        Queue<Character> encryptedQueue = encrypt(message, shift);

        // Show Encrypted message
        System.out.print("Encrypted Message: ");
        for (char ch : encryptedQueue) {
            System.out.print(ch);
        }
        System.out.println();

        // Decryption
        String decryptedMessage = decrypt(new LinkedList<>(encryptedQueue), shift);
        System.out.println("Decrypted Message: " + decryptedMessage);

        scanner.close();
    }
}
