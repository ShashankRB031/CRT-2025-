public class LinkedList {
    // Node class representing each element in the list
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create individual nodes
        Node head = new Node(10);
        Node middle = new Node(20);
        Node last = new Node(30);

        // Link the nodes together
        head.next = middle;
        middle.next = last;

        // Print the linked list
        System.out.print("Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
