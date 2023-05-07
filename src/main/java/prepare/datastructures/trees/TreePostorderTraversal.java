package prepare.datastructures.trees;

public class TreePostorderTraversal {

    public static void preOrder(Node root) {

        if (root == null) return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.printf("%d ", root.data);
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
