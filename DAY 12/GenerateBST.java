import java.util.Scanner;

// Node of BST
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

    // Insert a node into the BST
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    // Inorder traversal (sorted order)
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

// Main class to generate BST
public class GenerateBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();

        System.out.print("Enter number of nodes to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("Inorder Traversal (Sorted BST): ");
        tree.inorder(tree.root);
        System.out.println();

        sc.close();
    }
}
