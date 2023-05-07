package prepare.datastructures.trees;

public class TreePreorderTraversal {

    public static void preOrder(Node root) {

        if (root == null) return;
        System.out.printf("%d ", root.data);
        preOrder(root.left);
        preOrder(root.right);
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
