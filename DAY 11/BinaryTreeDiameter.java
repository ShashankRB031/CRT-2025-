class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class BinaryTreeDiameter {
    Node root;
    int maxDiameter = 0;

    public int height(Node node) {
        if (node == null)
            return -1; // Use 0 if height is measured in terms of number of nodes

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Update the diameter at this node
        int localDiameter = leftHeight + rightHeight + 2;
        maxDiameter = Math.max(maxDiameter, localDiameter);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int diameter() {
        maxDiameter = 0;
        height(root);  // Calculates height and updates maxDiameter
        return maxDiameter;
    }

    public static void main(String[] args) {
        BinaryTreeDiameter tree = new BinaryTreeDiameter(); 
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Diameter of the tree is: " + tree.diameter());
    }
}
