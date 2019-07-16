package jianZhiOffer01.offer41_66;

import jianZhiOffer01.jianzhioffer.FindKthToTailDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class offer42 {
    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int i =0;
        int j = array.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while (i<j){
            if (array[i]+array[j]<sum){
                i++;
            }else if (array[i]+array[j]>sum){
                j--;
            }  else {
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> list = FindNumbersWithSum(arr, 6);
        System.out.println(Arrays.asList(1,2));
        System.out.println(list);

    }
}
