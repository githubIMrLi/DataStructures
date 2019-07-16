package jianZhiOffer01.offer41_66;

import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class offer59 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        boolean reverse = false;
        while (!queue.isEmpty()){
            int cnt = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (cnt-->0){
                TreeNode node = queue.poll();
                if (node==null)
                    continue;
                list.add(node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            }
            if (reverse)
                Collections.reverse(list);
            reverse = !reverse;
            if (list.size()!=0)
                ret.add(list);
        }
        return ret;
    }
}
