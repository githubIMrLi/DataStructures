package jianZhiOffer01.offer41_66;

import java.util.LinkedList;
import java.util.Queue;

public class offer54 {

   private int[] cnts = new int[256];
   private Queue<Character> queue = new LinkedList<>();

    public void Insert(char ch) {
       cnts[ch]++;
       queue.offer(ch);
       while (!queue.isEmpty()&&cnts[queue.peek()]>1)
           queue.poll();
    }

    public char FirstAppearingOnce() {
        return queue.isEmpty()?'#':queue.peek();
    }
}
