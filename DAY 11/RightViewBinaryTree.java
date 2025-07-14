import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class RightViewBinaryTree {
    Node root;

    public void printRightView(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at current level

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();

                // Print the last node of each level
                if (i == levelSize - 1) {
                    System.out.print(current.data + " ");
                }

                // Add children to queue
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        RightViewBinaryTree tree = new RightViewBinaryTree();

        // Construct the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        System.out.println("Right View of Binary Tree:");
        tree.printRightView(tree.root);
    }
}
