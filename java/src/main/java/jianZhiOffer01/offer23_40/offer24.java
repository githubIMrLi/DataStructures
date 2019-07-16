package jianZhiOffer01.offer23_40;

import java.util.ArrayList;

public class offer24 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    //全局变量，都对它修改
    private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backtracking(root, target, new ArrayList<>());
        return ret;
    }

    private void backtracking(TreeNode root, int target, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            ret.add(new ArrayList<>(path));
        } else {
            backtracking(root.left, target, new ArrayList<>());
            backtracking(root.right, target, new ArrayList<>());
        }
        path.remove(path.size() - 1);
    }
}
