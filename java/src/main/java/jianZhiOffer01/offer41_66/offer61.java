package jianZhiOffer01.offer41_66;

import sun.reflect.generics.tree.Tree;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;

public class offer61 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    String Serialize(TreeNode root) {
        if (root==null)
            return "#!";
        String res = root.val+"!";
        res += Serialize(root.left);
        res += Serialize(root.right);
        return res;
    }
    TreeNode Deserialize(String str) {
        String[] split = str.split("!");
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < split.length; i++) {
            queue.offer(split[i]);
        }
        return getDeserialize(queue);
    }

    private TreeNode getDeserialize(Queue<String> queue) {
       String value = queue.poll();
       if (value.equals("#"))
           return null;
       TreeNode head = new TreeNode(Integer.valueOf(value));
       head.left = getDeserialize(queue);
       head.right = getDeserialize(queue);
       return head;
    }


}
