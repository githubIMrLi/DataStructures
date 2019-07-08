package jianZhiOffer01.offer3_10;

public class offer15 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        ListNode newList = new ListNode(-1);
        while (head!=null){
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;
        }
        return newList.next;
    }

    public ListNode ReverseList2(ListNode head) {
        if(head==null||head.next ==null){
            return head;
        }
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = ReverseList2(next);
        next.next = head;
        return newHead;
    }
}
