package com.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        System.out.println("归并排序前=" + Arrays.toString(arr));
        int temp[] = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);

        System.out.println("归并排序后=" + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        int mid = (left + right) / 2;
        if (left < right) {
            //左分解
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid + 1, right, temp);
            //合并
            merge(arr, left, mid, right, temp);
        }

    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;

        //拷贝数据到temp
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[t] = arr[i];
                ++t;
                ++i;
            } else {
                temp[t] = arr[j];
                ++t;
                ++j;
            }
        }

        //剩余数据也拷贝过去
        while (i <= mid) {
            temp[t] = arr[i];
            ++t;
            ++i;
        }

        while (j <= right) {
            temp[t] = arr[j];
            ++t;
            ++j;
        }

        //从temp将排好序的拷贝回来
        t = 0;
        for (int tempLeft = left; tempLeft <= right; ++tempLeft) {
            arr[tempLeft] = temp[t];
            ++t;
        }
    }
}
