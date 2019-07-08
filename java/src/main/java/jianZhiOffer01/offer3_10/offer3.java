package jianZhiOffer01.offer3_10;

import java.util.ArrayList;
import java.util.Stack;

public class offer3 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode!=null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
