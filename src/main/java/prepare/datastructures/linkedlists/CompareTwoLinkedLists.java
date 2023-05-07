package prepare.datastructures.linkedlists;

public class CompareTwoLinkedLists {

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) break;
            head1 = head1.next;
            head2 = head2.next;
        }

        return head1 == head2;
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
