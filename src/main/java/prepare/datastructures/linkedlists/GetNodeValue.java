package prepare.datastructures.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class GetNodeValue {

    class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    class Result {

        /*
         * Complete the 'getNode' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_SINGLY_LINKED_LIST llist
         *  2. INTEGER positionFromTail
         */

        /*
         * For your reference:
         *
         * SinglyLinkedListNode {
         *     int data;
         *     SinglyLinkedListNode next;
         * }
         *
         */

        public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
            // Write your code here

            List<Integer> listItems = new ArrayList<>();
            SinglyLinkedListNode current = llist;
            while (current != null) {
                listItems.add(current.data);
                current = current.next;
            }

            return listItems.get(listItems.size() - positionFromTail - 1);
        }

    }
}
