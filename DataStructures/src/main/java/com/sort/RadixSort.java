package com.sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {

        int[] arr = {53, 3, 542, 748, 14, 214};
        System.out.println("排序前：" + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("排序前：" + Arrays.toString(arr));

    }

    //基数排序
    public static void radixSort(int[] arr) {

        //1.得到数组中最大的数的位数
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //2. 得到最大数是位数
        int maxLength = (max + "").length();


        int[][] bucket = new int[10][arr.length];

        int[] bucketElementCount = new int[10];

        //使用循环将代码处理
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            //针对每个元素的对应位进行排序处理
            for (int j = 0; j < arr.length; j++) {
                //取出每个元素的个数的值
                int digitOfElement = arr[j] / n % 10;
                //放入对应的桶中
                bucket[digitOfElement][bucketElementCount[digitOfElement]] = arr[j];
                bucketElementCount[digitOfElement]++;
            }

            //按照这个桶的顺序排序
            int index = 0;
            for (int k = 0; k < bucketElementCount.length; k++) {
                if (bucketElementCount[k] != 0){
                    for (int l = 0; l < bucketElementCount[k]; l++) {
                        //取出元素放入arr
                        arr[index++] = bucket[k][l];
                    }
                }
                bucketElementCount[k] = 0;
            }
        }
    }

}
