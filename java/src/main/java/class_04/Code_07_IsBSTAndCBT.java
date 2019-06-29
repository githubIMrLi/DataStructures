package class_04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Code_07_IsBSTAndCBT {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static boolean isBST(Node head) {
        if (head == null) {
            return true;
        }
        boolean res = true;
        Node pre = null;
        Node cur1 = head;
        Node cur2 = null;
        while (cur1 != null) {
            cur2 = cur1.left;
            if (cur2 != null) {
                while (cur2.right != null && cur2.right != cur1) {
                    cur2 = cur2.right;
                }
                if (cur2.right == null) {
                    cur2.right = cur1;
                    cur1 = cur1.left;
                    continue;
                } else {
                    cur2.right = null;
                }
            }
            if (pre != null && pre.value > cur1.value) {
                res = false;
            }
            pre = cur1;
            cur1 = cur1.right;
        }
        return res;
    }

    public static boolean isBST2(Node head) {
        if (head != null) {
            Stack<Node> stack = new Stack<>();
            int pre = 0;
            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    if (pre <= head.value) {
                        pre = head.value;
                    } else {
                        return false;
                    }
                    head = head.right;
                }
            }
        }
        return true;
    }

    public static boolean isCBT(Node head) {
        if (head==null){
            return true;
        }
        /**
         * 1. 节点的右孩子不为null，左孩子为null，肯定不是完全二叉树
         * 2. 左右孩子不是双全时，之后遍历到的都是叶节点，否则不是完全二叉树
         */
        Queue<Node> queue = new LinkedList<>();
        Node l = null;
        Node r = null;
        boolean leaf = false;
        queue.offer(head);
        while (queue!=null){
            head = queue.poll();
            l = head.left;
            r = head.right;
            if ((l==null&&r!=null)||(leaf&&(l!=null||r!=null))){
                return false;
            }
            if (l!=null){
                queue.offer(l);
            }
            if (r !=null){
                queue.offer(r);
            }else {
                leaf = true;
            }
        }
        return true;
    }

    // for test -- print tree
    public static void printTree(Node head) {
        System.out.println("Binary Tree:");
        printInOrder(head, 0, "H", 17);
        System.out.println();
    }

    public static void printInOrder(Node head, int height, String to, int len) {
        if (head == null) {
            return;
        }
        printInOrder(head.right, height + 1, "v", len);
        String val = to + head.value + to;
        int lenM = val.length();
        int lenL = (len - lenM) / 2;
        int lenR = len - lenM - lenL;
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(head.left, height + 1, "^", len);
    }

    public static String getSpace(int num) {
        String space = " ";
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < num; i++) {
            buf.append(space);
        }
        return buf.toString();
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.left = new Node(2);
        head.right = new Node(6);
        head.left.left = new Node(1);
        head.left.right = new Node(3);
        head.right.left = new Node(5);

        printTree(head);
        System.out.println(isBST2(head));
        System.out.println(isCBT(head));

    }
}