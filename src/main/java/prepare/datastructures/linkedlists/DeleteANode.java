package prepare.datastructures.linkedlists;

public class DeleteANode {

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

        public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {

            if (position == 0) {

                llist = llist.next;

                return llist;
            }

            SinglyLinkedListNode current = llist;
            int counter = 0;
            while (counter < position - 1) {

                current = current.next;
                counter++;
            }

            current.next = current.next.next;

            return llist;
        }
    }
}
