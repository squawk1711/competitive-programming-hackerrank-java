package prepare.datastructures.linkedlists;

import java.util.HashSet;
import java.util.Set;

public class CycleDetection {

    static boolean hasCycle(SinglyLinkedListNode head) {

        Set<SinglyLinkedListNode> set = new HashSet<>();

        SinglyLinkedListNode current = head;

        while (current != null) {
            if (set.contains(current)) return true;
            set.add(current);
            current = current.next;
        }

        return false;
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
