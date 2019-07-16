package jianZhiOffer01.offer3_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class offer22 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
       ArrayList<Integer> list = new ArrayList<>();
       queue.offer(root);
       while (!queue.isEmpty()){
           int cnt = queue.size();
           while (cnt-->0){
               TreeNode t = queue.poll();
               if (t==null){
                   continue;
               }
               list.add(t.val);
               queue.offer(t.left);
               queue.offer(t.right);
           }
       }
       return list;
    }
}
