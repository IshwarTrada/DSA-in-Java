// Kth ancestor of node

public class P16 {
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

    // Find LCA
    public static Node lca(Node root, int n1, int n2) { // O(n)

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);

        // leftLCA (valid) and rightLCA (null)
        if (rightLCA == null) {
            return leftLCA;
        }
        // leftLCA (null) and rightLCA (valid)
        if (leftLCA == null) {
            return rightLCA;
        }

        return root;
    }

    // Find distance b|w lca and nodes
    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }

    }

    // Minimum distance
    public static int KAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.println(k + "th ancestor of " + n + " is " + root.data);
        }
        return max + 1;
    }

    public static void main(String[] args) {
         //       1
         //     /   \
         //    2     3
         //   / \   / \
         //  4   5 6   7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n = 5, k = 2;
        KAncestor(root, n, k);
    }
}
