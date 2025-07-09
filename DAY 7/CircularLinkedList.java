public class CircularLinkedList {
    
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head node
    Node head = null;
    Node tail = null;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;  // Point to itself
        } else {
            tail.next = newNode;  // Old tail points to new node
            tail = newNode;       // New node becomes tail
            tail.next = head;     // New tail points back to head
        }
    }

    // Display circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    // Main method
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();  // Output: 10 -> 20 -> 30 -> 40 -> (back to head)
    }
}
