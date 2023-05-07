package prepare.datastructures.linkedlists;

public class ReverseADoublyLinkedList {

    class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    class Result {

        /*
         * Complete the 'reverse' function below.
         *
         * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
         * The function accepts INTEGER_DOUBLY_LINKED_LIST llist as parameter.
         */

        /*
         * For your reference:
         *
         * DoublyLinkedListNode {
         *     int data;
         *     DoublyLinkedListNode next;
         *     DoublyLinkedListNode prev;
         * }
         *
         */

        public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
            // Write your code here

            DoublyLinkedListNode prev = null;
            DoublyLinkedListNode current = llist;

            while (current != null) {
                prev = current.prev;
                current.prev = current.next;
                current.next = prev;
                current = current.prev;
            }

            if (prev != null) {
                llist = prev.prev;
            }

            return llist;
        }
    }
}
