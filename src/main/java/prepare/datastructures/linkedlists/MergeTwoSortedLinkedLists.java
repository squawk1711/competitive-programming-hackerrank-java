package prepare.datastructures.linkedlists;

public class MergeTwoSortedLinkedLists {

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(Integer.MIN_VALUE);

        SinglyLinkedListNode head = newNode;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {

                newNode.next = head1;
                head1 = head1.next;
            } else {

                newNode.next = head2;
                head2 = head2.next;
            }

            newNode = newNode.next;
        }

        if (head1 == null) {

            newNode.next = head2;
        } else {

            newNode.next = head1;
        }

        return head.next;
    }

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
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
}
