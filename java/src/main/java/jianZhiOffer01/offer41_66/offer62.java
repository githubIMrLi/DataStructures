package jianZhiOffer01.offer41_66;

import sun.reflect.generics.tree.Tree;

public class offer62 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    TreeNode ret;
    int cnt = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {
        inOrder(pRoot, k);
        return ret;
    }

    private void inOrder(TreeNode root, int k) {
        if (root == null || k < 0)
            return;
        inOrder(root.left,k);
        cnt++;
        if (cnt==k)
            ret = root;
        inOrder(root.right,k);
    }
}
