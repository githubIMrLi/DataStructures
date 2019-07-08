package jianZhiOffer01.jianzhioffer02;

public class TreeDepthDemo {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public static int TreeDepth(TreeNode root) {
        int count =0;
        while (root!=null){
            count++;
            root = root.left;
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(2);
        node1.left.left = new TreeNode(3);
        node1.right = new TreeNode(4);
        System.out.println(TreeDepth(node1));
    }
}
