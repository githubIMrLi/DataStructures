package jianZhiOffer01.offer41_66;

import java.util.List;

public class offer56 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead==null||pHead.next==null)
            return pHead;
        ListNode next = pHead.next;
        if (pHead.val==next.val){
            while (next!=null&&pHead.val==next.val)
                next = next.next;
            return deleteDuplication(next);
        }else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}
