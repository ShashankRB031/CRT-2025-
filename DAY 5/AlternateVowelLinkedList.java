public class AlternateVowelLinkedList {

    // Node class representing each vowel
    static class Node {
        char vowel;
        Node next;

        // Constructor
        Node(char vowel) {
            this.vowel = vowel;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create vowel nodes
        Node head = new Node('A');
        Node second = new Node('E');
        Node third = new Node('I');
        Node fourth = new Node('O');
        Node fifth = new Node('U');

        // Link the nodes together
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Print the full vowel linked list
        System.out.print("Vowel Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.vowel + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");

        // Print alternate vowels
        System.out.print("Alternate Vowels: ");
        temp = head;
        boolean print = true;

        while (temp != null) {
            if (print) {
                System.out.print(temp.vowel + " ");
            }
            print = !print; // Skip every second node
            temp = temp.next;
        }

        System.out.println(); // Final newline
    }
}
