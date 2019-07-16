package jianZhiOffer01.offer41_66;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class offer64 {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (num.length<size||size<1)
            return ret;
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1,o2)->o2-o1);
        for (int i = 0; i < size; i++) {
            heap.add(num[i]);
        }
        ret.add(heap.peek());
        for (int i = 0,j=i+size; j<num.length ; i++,j++) {
            heap.remove(num[i]);
            heap.add(num[j]);
            ret.add(heap.peek());
        }
        return ret;
    }
}
