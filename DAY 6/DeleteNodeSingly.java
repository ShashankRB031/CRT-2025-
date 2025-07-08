class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodeSingly {
    Node head = null;

    // Insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Delete node by value
    public void deleteByValue(int key) {
        Node temp = head;
        Node prev = null;

        // Case 1: head node holds the key
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Traverse to find the node
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // Key not found
        if (temp == null) {
            System.out.println("Value " + key + " not found.");
            return;
        }

        // Unlink the node
        prev.next = temp.next;
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

    // Main method
    public static void main(String[] args) {
        DeleteNodeSingly list = new DeleteNodeSingly();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Original List:");
        list.printList();

        list.deleteByValue(20);

        System.out.println("After Deleting 20:");
        list.printList();
    }
}
