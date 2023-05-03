package prepare.datastructures.linkedlists;

public class InsertANodeAtTheHeadOfALinkedList {

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (llist == null) {

            llist = newNode;
            return llist;
        }

        newNode.next = llist;
        llist = newNode;

        return llist;
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


    }
}
