package classOne.class_07;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Code_03_IPO {
    public static class Node {
        public int c;
        public int p;

        public Node(int c, int p) {
            this.c = c;
            this.p = p;
        }
    }

    public static class MinCostComparator implements Comparator<Node> {


        @Override
        public int compare(Node o1, Node o2) {
            return o1.c - o2.c;
        }
    }

    public static class MaxProfitComparator implements Comparator<Node> {


        @Override
        public int compare(Node o1, Node o2) {
            return o2.p - o1.p;
        }
    }

    public static int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        Node[] nodes = new Node[Profits.length];
        for (int i = 0; i < Profits.length; i++) {
            nodes[i] = new Node(Capital[i],Profits[i]);
        }
        PriorityQueue<Node> minCostsQ = new PriorityQueue<>();
        PriorityQueue<Node> maxProfitsQ = new PriorityQueue<>();
        for (int i = 0; i < nodes.length; i++) {
            minCostsQ.offer(nodes[i]);
        }
        for (int i = 0; i < k; i++) {
            while (!minCostsQ.isEmpty()&&minCostsQ.peek().c<=W){
                maxProfitsQ.add(minCostsQ.poll());
            }
            if (maxProfitsQ.isEmpty()){
                return W;
            }
            W += maxProfitsQ.poll().p;

        }
        return W;
    }

}
