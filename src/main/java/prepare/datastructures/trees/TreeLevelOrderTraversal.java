package prepare.datastructures.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeLevelOrderTraversal {

    public static void levelOrder(Node root) {

        if (root == null) return;

        Queue<Node> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            Node front = queue.remove();
            System.out.printf("%d ", front.data);
            if (front.left != null) queue.add(front.left);
            if (front.right != null) queue.add(front.right);
        }
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
