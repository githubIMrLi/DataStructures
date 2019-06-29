package jianzhioffer;

public class FindFirstCommonNodeDemo {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode node1 = pHead1;
        ListNode node2 = pHead2;
        int n = 0;
        while (node1.next != null) {
            n++;
            node1 = node1.next;
        }
        while (node2.next != null) {
            n--;
            node2 = node2.next;
        }
        node1 = n > 0 ? pHead1 : pHead2;
        node2 = node1 == pHead1 ? pHead2 : pHead1;
        n = Math.abs(n);
        while (n != 0) {
            n--;
            node1 = node1.next;
        }
        while (node1 != node2) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }
}
