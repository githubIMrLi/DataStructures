package jianZhiOffer01.offer41_66;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.PriorityQueue;

public class offer63 {

    private PriorityQueue<Integer> left = new PriorityQueue<>((o1,o2)->o2-o1);
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    private int N = 0;

    public void Insert(Integer num) {
       if (N%2==0) {
           left.add(num);
           right.add(left.poll());
       }else {
           right.add(num);
           left.add(right.poll());
       }
       N++;
    }

    public Double GetMedian() {
        if (N%2==0)
            return (left.peek()+right.peek())/2.0;
        else
            return (double)right.poll(); //0开始，先加的是右边。
    }
}
