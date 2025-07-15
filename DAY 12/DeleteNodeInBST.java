import java.util.Scanner;

// Node class
class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

// Binary Search Tree class
class BST {
    Node root;

    // Insert a node
    public Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);
        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);
        return root;
    }

    // Inorder traversal
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Find min value node in subtree
    public Node findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    // Delete a node from BST
    public Node delete(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node found
            // Case 1: No child
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            // Case 3: Two children
            Node minRight = findMin(root.right); // in-order successor
            root.data = minRight.data;           // copy value
            root.right = delete(root.right, minRight.data); // delete duplicate
        }

        return root;
    }
}

// Main class
public class DeleteNodeInBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();

        System.out.print("Enter number of nodes to insert: ");
        int n = sc.nextInt();
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("Inorder before deletion: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Enter value to delete: ");
        int key = sc.nextInt();
        tree.root = tree.delete(tree.root, key);

        System.out.print("Inorder after deletion: ");
        tree.inorder(tree.root);
        System.out.println();

        sc.close();
    }
}
