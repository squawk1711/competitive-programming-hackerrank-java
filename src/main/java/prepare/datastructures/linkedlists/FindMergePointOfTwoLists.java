package prepare.datastructures.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class FindMergePointOfTwoLists {

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        List<SinglyLinkedListNode> head1List = new ArrayList<>();

        while (head1 != null) {
            head1List.add(head1);
            head1 = head1.next;
        }

        while (head2 != null) {
            if (head1List.contains(head2)) return head2.data;
            head2 = head2.next;
        }

        return -1;
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
