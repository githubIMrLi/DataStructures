package jianzhioffer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReOrderArrayDemo {

    public void reOrderArray(int [] array) {
        if (array == null){
            return;
        }
        Queue queue1 = new LinkedList();
        Queue queue2 = new LinkedList();
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==1){
                queue1.offer(array[i]);
            }else {
                queue2.offer(array[i]);
            }
        }
        int n =0;
        while (!queue1.isEmpty()){
            array[n++] = (int)queue1.poll();
        }
        while (!queue2.isEmpty()){
            array[n++] = (int)queue2.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ReOrderArrayDemo reOrderArrayDemo = new ReOrderArrayDemo();
    }
}
