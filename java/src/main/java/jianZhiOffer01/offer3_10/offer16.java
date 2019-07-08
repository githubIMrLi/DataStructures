package jianZhiOffer01.offer3_10;

public class offer16 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /*public class Solution {
        public ListNode Merge(ListNode list1,ListNode list2) {
            ListNode head = new ListNode(Integer.MIN_VALUE);
            ListNode cur = head;

            while (list1!=null&&list2!=null){
                if (list1.val<list2.val){
                    cur.next = list1;
                    cur = cur.next;
                    list1 = list1.next;
                }else {
                    cur.next = list2;
                    cur = cur.next;
                    list2 = list2.next;
                }
            }

            while (list1!=null){
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            }

            while (list2!= null){
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }

            return head.next;
        }
    }*/
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                list2= list2.next;
            }
            cur = cur.next;
        }
        if (list1!=null){
            cur.next = list1;
        }
        if (list2!=null){
            cur.next = list2;
        }
        return head.next;
    }

}
