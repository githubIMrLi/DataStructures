package com.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};

        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));

    }

    public static void insertSort(int[] arr) {
      int val = 0;
      int index = 0;
        for (int i = 1; i < arr.length; i++) {
            val = arr[i];
            index = i-1;
            while (index>= 0 && val<arr[index]){
                arr[index+1] = arr[index];
                index--;
            }
            if (index+1 != i){
                arr[index+1] = val;
            }
        }
    }
}
