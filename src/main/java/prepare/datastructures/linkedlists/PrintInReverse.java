package prepare.datastructures.linkedlists;

public class PrintInReverse {

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

        public static void reversePrint(SinglyLinkedListNode llist) {

            if (llist.next == null) {

                System.out.println(llist.data);
                return;
            }
            reversePrint(llist.next);
            System.out.println(llist.data);
        }
    }
}
