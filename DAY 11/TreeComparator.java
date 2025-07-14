class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class TreeComparator {
    public boolean isSameTree(Node root1, Node root2) {
        // Both are null — trees are identical
        if (root1 == null && root2 == null)
            return true;

        // One is null and the other is not — not identical
        if (root1 == null || root2 == null)
            return false;

        // Check current node data and recurse for left and right subtrees
        return (root1.data == root2.data) &&
               isSameTree(root1.left, root2.left) &&
               isSameTree(root1.right, root2.right);
    }

    public static void main(String[] args) {
        TreeComparator comparator = new TreeComparator();

        // Tree 1
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        // Tree 2
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        System.out.println("Are the trees the same? " +
            comparator.isSameTree(root1, root2));
    }
}
