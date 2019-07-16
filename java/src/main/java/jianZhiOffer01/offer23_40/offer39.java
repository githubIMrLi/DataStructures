package jianZhiOffer01.offer23_40;

public class offer39 {
    /*public boolean IsBalanced_Solution(TreeNode head) {
        boolean[] res = new boolean[1];
        res[0] = true;
        getHight(head,1,res);
        return res[0];
    }

    private int getHight(TreeNode head, int level, boolean[] res) {
        if (head==null){
            return level;
        }
        int lH = getHight(head.left,level+1,res);
        if (!res[0]){
            return level;
        }
        int rH = getHight(head.right,level+1,res);
        if (!res[0]){
            return level;
        }
        if (Math.abs(lH-rH)>1){
            res[0] = false;
        }
        return Math.max(lH,rH);
    }*/

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    private boolean isBalance = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        height(root);
        return isBalance;
    }

    private int height(TreeNode root) {
        if (root==null||!isBalance)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left-right)>1)
            isBalance = false;
        return 1+Math.max(left,right);
    }
}
