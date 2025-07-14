import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class ZigZagTraversal {
    Node root;

    public void printZigZagOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;  // Toggle direction at each level

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int[] level = new int[levelSize]; // Store nodes for current level

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();

                // Store node in correct position based on direction
                int index = leftToRight ? i : (levelSize - 1 - i);
                level[index] = current.data;

                // Enqueue child nodes
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            // Print the level
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();

            // Change direction
            leftToRight = !leftToRight;
        }
    }

    public static void main(String[] args) {
        ZigZagTraversal tree = new ZigZagTraversal();

        // Construct tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        System.out.println("Zig-Zag Level Order Traversal:");
        tree.printZigZagOrder(tree.root);
    }
}
