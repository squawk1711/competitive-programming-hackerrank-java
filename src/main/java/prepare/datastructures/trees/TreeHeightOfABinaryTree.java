package prepare.datastructures.trees;

public class TreeHeightOfABinaryTree {

    public static int height(Node root) {
        // Write your code here.

        if (root == null) return -1;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
