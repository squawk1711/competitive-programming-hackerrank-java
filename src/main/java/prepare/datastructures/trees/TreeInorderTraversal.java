package prepare.datastructures.trees;

public class TreeInorderTraversal {

    public static void inOrder(Node root) {

        if (root == null) return;
        inOrder(root.left);
        System.out.printf("%d ", root.data);
        inOrder(root.right);
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
