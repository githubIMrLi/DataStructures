package jianZhiOffer01.offer41_66;

public class offer57 {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode ==null)
            return null;
        if (pNode.right!=null){
            pNode = pNode.right;
            while (pNode.left!=null)
                pNode = pNode.left;
            return pNode;
        }
        while (pNode.next!=null){
            if (pNode.next.left==pNode)
                return pNode.next;
            pNode = pNode.next;
        }
        return null;
    }
}
