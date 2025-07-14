class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class BinaryTreeLevel {
    Node root;

    // Method to find the height (or level) of the binary tree
    public int findHeight(Node node) {
        if (node == null)
            return -1; // Use -1 if you consider height of leaf as 0
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BinaryTreeLevel tree = new BinaryTreeLevel();

        // Construct the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(6);

        // Print the height (level) of the tree
        int height = tree.findHeight(tree.root);
        System.out.println("Height of the tree: " + height);
    }
}
