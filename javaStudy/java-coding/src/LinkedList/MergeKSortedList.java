package LinkedList;

import java.util.PriorityQueue;
public class MergeKSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] list = new ListNode[3];
        list[0] = l1;
        list[1] = l2;
        list[2] = l3;
        MergeKSortedList a = new MergeKSortedList();
        ListNode result = a.mergeKLists(list);
        System.out.println("=====");
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    private ListNode mergeKLists(ListNode[] lists) {
        //1
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>((a, b) -> a.val - b.val);
        ListNode newHead = new ListNode(0);
        ListNode p = newHead;

        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);
            }
        }

        //2
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            p.next =  node;
            p = p.next;
            if (node.next != null) {
                queue.offer(node.next);
            }
        }
        return newHead.next;
    }
}
/*
input
1->4->5
1->3->4
2->6

output
1->1->2->3->4->4->5->6
----
priority queue
* */
