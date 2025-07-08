class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertatEndSingly {

    Node head = null; // Head of the list

    // Insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If list is empty, make newNode the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, traverse to the end
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link the new node at the end
        temp.next = newNode;
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Main method to test
    public static void main(String[] args) {
        InsertatEndSingly list = new InsertatEndSingly();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Linked List:");
        list.printList();
    }
}
