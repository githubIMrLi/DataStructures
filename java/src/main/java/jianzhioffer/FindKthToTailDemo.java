package jianzhioffer;


import java.util.Stack;

public class FindKthToTailDemo {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {

        if (head==null){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head!=null){
            stack.push(head);
            head = head.next;
        }
        if (stack.size()<k||k<0){
            return null;
        }
        for (int i = 0; i < k; i++) {
            head = stack.pop();
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(1);

        node2 = node1.next;
        node3 = node2.next;
        node4 = node3.next;

        FindKthToTailDemo findKthToTailDemo = new FindKthToTailDemo();
        System.out.println(findKthToTailDemo.FindKthToTail(node1, 1).val);

    }
}
