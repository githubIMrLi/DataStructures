package jianZhiOffer01.offer23_40;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class offer29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (k<0||k>input.length){
            return new ArrayList<Integer>();
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->o2-o1);
        for (int val : input){
            queue.add(val);
            if (queue.size()>k){
                queue.poll();
            }
        }
        return new ArrayList<Integer>(queue);
    }
}
