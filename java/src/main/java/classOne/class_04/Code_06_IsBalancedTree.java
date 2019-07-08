package classOne.class_04;

public class Code_06_IsBalancedTree {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static boolean isBalance(Node head) {
        boolean[] res = new boolean[1];
        res[0] = true;
        //高度是返回值+1
        int hight = getHight(head, 1, res)+1;
        System.out.println(hight);
        return res[0];
    }

    public static int getHight(Node head, int level, boolean[] res) {
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
            res[0] =  false;
        }
        return Math.max(lH,rH);
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        head.right.right.right = new Node(8);
        head.right.right.right.right = new Node(9);

        System.out.println(isBalance(head));

    }

}
