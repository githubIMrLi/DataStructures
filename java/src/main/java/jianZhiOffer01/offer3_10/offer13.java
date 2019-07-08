package jianZhiOffer01.offer3_10;

import java.util.LinkedList;
import java.util.Queue;

public class offer13 {
    public void reOrderArray(int[] array) {
        int count = 0;
        for (int x: array){
            if (x%2!=0){
                count++;
            }
        }
        int[] clone = array.clone();
        int i = 0;
        int j = count;
        for (int num : clone){
            if (num%2!=0){
                array[i++] = num;
            }else {
                array[j++] = num;
            }
        }
    }

    public void reOrderArray2(int[] array) {
        if (array == null) {
            return;
        }
        Queue queue1 = new LinkedList();
        Queue queue2 = new LinkedList();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                queue1.offer(array[i]);
            } else {
                queue2.offer(array[i]);
            }
        }
        int n = 0;
        while (!queue1.isEmpty()) {
            array[n++] = (int) queue1.poll();
        }
        while (!queue2.isEmpty()) {
            array[n++] = (int) queue2.poll();
        }
    }

    private boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) {

    }
}
