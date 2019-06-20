package com.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 9, -1, 10, 20};

//        System.out.println("排序前");
//        System.out.println(Arrays.toString(arr));
        //测试冒泡排序
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

//        System.out.println("排序后");
//        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        //定义一个临时变量
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (flag) {
                flag = false;
            } else {
                break;
            }
        }
    }
}