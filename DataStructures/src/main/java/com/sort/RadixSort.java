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


        //定义一个二维数组，表示10个桶，每个桶就是一个一维数组
        //说明
        //1. 二维数组包含10个一位数组
        //2. 为了防止在放入数的时候，数据溢出，则每个一位数组（桶），大小定arr.length
        //3. 明确，基数排序是使用空间换时间的经典算法
        int[][] bucket = new int[10][arr.length];

        //为了记录每个桶中，实际存放了多少个数据，我们定义一个一位数组来记录各个桶的每次放入的数据
        //bucketElementCount[0] 记录的就是bucket[0]桶的放入数据的个数
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

            //按照这个桶的顺序（一维数组的下标依次取出数据，放入原来数组）
            int index = 0;
            //遍历每一个桶，并将桶中输入，放入到原数组
            for (int k = 0; k < bucketElementCount.length; k++) {
                //如果桶中有数据，我们才放入到原数组
                if (bucketElementCount[k] != 0) {
                    //循环该桶即第k个桶（即第k个一维数组）放入
                    for (int l = 0; l < bucketElementCount[k]; l++) {
                        //取出元素放入arr
                        arr[index++] = bucket[k][l];
                    }
                }
                //第i+1轮处理后，需要将每个bucketElementCount[k]=0
                bucketElementCount[k] = 0;
            }
//            System.out.println("第"+(i+1)+"轮:"+Arrays.toString(arr));
        }
    }
}
