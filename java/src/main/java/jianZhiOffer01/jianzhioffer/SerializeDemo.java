package jianZhiOffer01.jianzhioffer;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDemo {

    //导包
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    String Serialize(TreeNode root) {
        if (root==null){
            return "#!";
        }
        String res = root.val+"!";
        res += Serialize(root.left);
        res += Serialize(root.right);
        return  res;
    }
    TreeNode Deserialize(String str) {
        String[] value = str.split("!");
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i !=value.length; i++) {
            queue.offer(value[i]);
        }
        return getDeserialize(queue);
    }

    private TreeNode getDeserialize(Queue<String> queue) {
        String value = queue.poll();
        if (value.equals("#")){
            return null;
        }
        TreeNode head = new TreeNode(Integer.valueOf(value));
        head.left = getDeserialize(queue);
        head.right = getDeserialize(queue);
        return head;
    }

    public static void main(String[] args) {

    }
}
