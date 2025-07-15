import java.util.Scanner;

// Node definition
class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

// BST class
class BST {
    Node root;

    // Insert a value
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

    // Search a value
    public boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }
}

// Main class
public class SearchInBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();

        // Insert elements
        System.out.print("Enter number of elements to insert: ");
        int n = sc.nextInt();
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            tree.root = tree.insert(tree.root, val);
        }

        // Search a value
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();
        if (tree.search(tree.root, key))
            System.out.println(key + " is found in the BST.");
        else
            System.out.println(key + " is NOT found in the BST.");

        sc.close();
    }
}
