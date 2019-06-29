package jianzhioffer;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;

public class IsBalanced_SolutionDemo {
    public boolean IsBalanced_Solution(SerializeDemo.TreeNode head) {
        boolean[] res = new boolean[1];
        res[0] = true;
        getHight(head,1,res);
        return res[0];
    }

    private int getHight(SerializeDemo.TreeNode head, int level, boolean[] res) {
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
    }
}
