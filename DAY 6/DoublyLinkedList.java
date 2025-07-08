class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    Node head = null;

    // Insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        // If list is not empty, update previous head
        if (head != null) {
            newNode.next = head;  // new node points to current head
            head.prev = newNode;  // current head points back to new node
        }

        // Update head to the new node
        head = newNode;
    }

    // Print list forward
    public void printList() {
        Node temp = head;
        System.out.print("List (forward): ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(30);
        dll.insertAtBeginning(20);
        dll.insertAtBeginning(10);

        dll.printList();  // Expected Output: 10 <-> 20 <-> 30 <-> null
    }
}
