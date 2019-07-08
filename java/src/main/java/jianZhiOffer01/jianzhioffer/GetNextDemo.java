package jianZhiOffer01.jianzhioffer;

import java.util.ArrayList;

public class GetNextDemo {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    //获取后继节点的两种方法：
    //1. 如果有右节点，那么它的最左孩子就是后继节点
    //2. 如果没有右节点，那么往上找，找到node是par的左孩子，那么par就是后继节点
    public TreeLinkNode GetNext(TreeLinkNode pNode,int k) {
        ArrayList<TreeLinkNode> list = inOrder(pNode);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).val==k){
                return list.get(i+1);
            }
        }
        return null;
    }

    public ArrayList inOrder(TreeLinkNode node){
        ArrayList<TreeLinkNode> list = new ArrayList<>();
        inOrder(node.left);
        list.add(node);
        inOrder(node.right);
        return list;
    }



    public static void main(String[] args) {

    }
}
