package prepare.datastructures.linkedlists;

public class InsertingANodeIntoASortedDoublyLinkedList {

    static class DoublyLinkedListNode {
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
         * Complete the 'sortedInsert' function below.
         *
         * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
         * The function accepts following parameters:
         *  1. INTEGER_DOUBLY_LINKED_LIST llist
         *  2. INTEGER data
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

        public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
            // Write your code here

            if (llist == null) {
                llist = new DoublyLinkedListNode(data);
                return llist;
            }

            DoublyLinkedListNode current = llist;
            DoublyLinkedListNode lastNode = null;

            while (current != null) {

                if (current.data > data) {

                    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
                    newNode.next = current;

                    if (current.prev == null) {

                        current.prev = newNode;
                        llist = newNode;
                    } else {

                        newNode.prev = current.prev;
                        newNode.prev.next = newNode;
                        current.prev = newNode;
                    }

                    break;
                }

                lastNode = current;
                current = current.next;
            }

            if (current == null) {

                lastNode.next = new DoublyLinkedListNode(data);
            }

            return llist;
        }
    }
}
