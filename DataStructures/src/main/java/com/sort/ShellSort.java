package com.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr= {8,9,1,7,2,3,5,4,6,0};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(arr));
    }

    //移位法
    public static void shellSort(int[] arr) {
        //增量gap，并逐步缩小增量
        //分组
        for (int gap = arr.length/2; gap >0 ; gap/=2) {
//            区内排序
            for (int i = gap; i < arr.length; i++) {
                //保存 i位置上的index 和value
                int j = i;
                int temp = arr[i];
                if (arr[j]<arr[j-gap]){
                    while (j-gap>=0&& temp< arr[j-gap]){
                        arr[j] = arr[j-gap];
                        j -=gap;
                    }
                    arr[j] = temp;
                }
            }
        }
    }
}
