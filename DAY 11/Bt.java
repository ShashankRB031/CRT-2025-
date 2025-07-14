class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class Bt {
    Node root;

    public void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.data + " "); // Use print instead of println for inline output
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        Bt tree = new Bt();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.printInOrder(tree.root); // Expected Output: 4 2 5 1 3
    }
}
