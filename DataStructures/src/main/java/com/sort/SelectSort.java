package com.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {  //循环n-1次即可
            int min = arr[i];
            int minIndex = i;

            //选出最小数
            for (int j = i+1; j < arr.length; j++) { //与i位置后一位比较
                if (min>arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
//            进行交换位置
            arr[minIndex] = arr[i];
            arr[i] = min;
        }

    }
}
