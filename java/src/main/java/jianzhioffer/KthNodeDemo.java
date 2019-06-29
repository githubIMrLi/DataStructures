package jianzhioffer;

import java.util.*;

public class KthNodeDemo {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode KthNode(TreeNode pRoot, int k) {
        int count = 0;
       if (pRoot==null|| k<=0){
           return null;
       }
        Stack<TreeNode> stack = new Stack<>();
       while (!stack.isEmpty()||pRoot!=null){
           if (pRoot!=null){
               stack.push(pRoot);
               pRoot = pRoot.right;
           }else {
               pRoot = stack.pop();
               count++;
               if (count==k){
                   return pRoot;
               }
               pRoot = pRoot.right;
           }
       }
        return pRoot;
    }

    private List<TreeNode> inOrderRe(TreeNode pRoot) {
        if (pRoot == null) {
            return null;
        }
        List<TreeNode> list = new ArrayList<>();

        inOrderRe(pRoot.left);
       list.add(pRoot);
        inOrderRe(pRoot.right);
        return list;
    }

    public static void printTree(TreeNode head) {
            System.out.println("Binary Tree:");
            printInOrder(head, 0, "H", 17);
            System.out.println();
        }

        public static void printInOrder(TreeNode head, int height, String to, int len) {
            if (head == null) {
                return;
            }
            printInOrder(head.right, height + 1, "v", len);
            String val = to + head.val + to;
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
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(2);
        head.right = new TreeNode(6);
        head.left.left = new TreeNode(1);
        head.left.right = new TreeNode(3);
        head.right.left = new TreeNode(5);

//        printTree(head);
        KthNodeDemo kthNodeDemo = new KthNodeDemo();
        TreeNode treeNode = kthNodeDemo.KthNode(head, 1);
        System.out.println(treeNode.val);

    }

}
