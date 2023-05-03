package prepare.datastructures.linkedlists;

public class PrintTheElementsOfALinkedList {

    static void printLinkedList(SinglyLinkedListNode head) {

        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }
}
