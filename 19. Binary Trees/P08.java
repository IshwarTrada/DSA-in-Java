// Diameter of Tree : no. of nodes in the longest path b|w 2 leaf
// Approach - 1 (Time complexity : O(n^2))

public class P08 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    // calculate height of a tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // calculate diameter
    public static int diameter(Node root) { // O(n^2)
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDiam = leftHeight + rightHeight + 1;

        return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
    }

    public static void main(String[] args) {
        /*
         *       1
         *     /   \
         *    2     3
         *   / \   / \
         *  4   5 6   7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Diameter of tree : " + diameter(root));

    }
}
