package prepare.datastructures.linkedlists;

public class InsertANodeAtTheTailOfALinkedList {

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        if (head == null) {

            head = new SinglyLinkedListNode(data);

            return head;
        }

        SinglyLinkedListNode current = head;

        while (current.next != null) {

            current = current.next;
        }

        current.next = new SinglyLinkedListNode(data);

        return head;
    }

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
            next = null;
        }
    }
}
