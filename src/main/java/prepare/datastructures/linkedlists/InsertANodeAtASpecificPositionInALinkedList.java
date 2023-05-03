package prepare.datastructures.linkedlists;

public class InsertANodeAtASpecificPositionInALinkedList {

    public SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (position == 0) {

            newNode.next = llist;
            llist = newNode;

            return llist;
        }

        SinglyLinkedListNode current = llist;

        int counter = 0;

        while (counter < position - 1) {

            current = current.next;

            counter++;
        }

        newNode.next = current.next;
        current.next = newNode;

        return llist;
    }

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
}
