package jianZhiOffer01.offer3_10;

import java.util.HashMap;
import java.util.Map;

public class offer4 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    private Map<Integer,Integer> indexForInOrders = new HashMap<>();

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        for (int i = 0; i < in.length; i++)
            indexForInOrders.put(in[i],i);

        return reConstructBinaryTree(pre,0,pre.length-1,0);
    }

    public TreeNode reConstructBinaryTree(int[] pre, int preL,int preR,int inL) {
        if (preL>preR)
            return null;
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexForInOrders.get(root.val);
        int leftTreeSize = inIndex-inL;
        root.left = reConstructBinaryTree(pre,preL+1,preL+leftTreeSize,inL);
        root.right = reConstructBinaryTree(pre,preL+leftTreeSize+1,preR,inL+leftTreeSize+1);
        return root;
    }

    public static void main(String[] args) {
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};

        offer4 offer = new offer4();
        TreeNode treeNode = offer.reConstructBinaryTree(pre, in);
        while (treeNode!=null){
            System.out.println(treeNode.val);
        }
    }
}
