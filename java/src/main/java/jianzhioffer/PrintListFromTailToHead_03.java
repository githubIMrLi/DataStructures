package jianzhioffer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class PrintListFromTailToHead_03 {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int value) {
            this.val = value;
        }
    }


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> list = new ArrayList<>();
        Stack stack = new Stack();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            list.add((Integer) stack.peek());
            stack.pop();
        }
        return list;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        PrintListFromTailToHead_03 print = new PrintListFromTailToHead_03();

    }

}
