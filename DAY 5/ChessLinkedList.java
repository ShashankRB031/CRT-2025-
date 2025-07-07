import java.util.Stack;

public class ChessLinkedList {

    // Node class representing each coin
    static class Node {
        String coin;
        Node next;

        Node(String coin) {
            this.coin = coin;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create the linked list in original order
        Node head = new Node("king");
        head.next = new Node("queen");
        head.next.next = new Node("pawn");
        head.next.next.next = new Node("horse");

        // Use stack to reverse print
        Stack<String> stack = new Stack<>();

        // Traverse and push all elements onto stack
        Node temp = head;
        while (temp != null) {
            stack.push(temp.coin);
            temp = temp.next;
        }

        // Print expected order: reversed
        System.out.print("Expected Order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
