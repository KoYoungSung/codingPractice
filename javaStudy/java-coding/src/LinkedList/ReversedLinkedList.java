package LinkedList;

public class ReversedLinkedList {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode head = reversedList(l1);

    }

    private static ListNode reversedList(ListNode current) {
        ListNode prev = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
/*
input
1->2->3->null
output
3->2->1->null
 */
