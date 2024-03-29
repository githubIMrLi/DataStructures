package com.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,10,8,22,34,5,12,28,21,11};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right){
        int l = left;
        int r = right;

        //pivot 中轴
        int pivot = arr[(left+right)/2];
        int temp = 0;
        //while循环的目的是让比pivot值小放到左边
        //比pivot值大放右边
        while (l<r){
//          在pivot的左边一直找，找到大于等于pivot值，才退出
            while (arr[l]<pivot){
                l +=1;
            }
//            在pivot的右边一直找，找到小于等于pivot值，才退出
            while (arr[r]>pivot){
                r-=1;
            }
            //如果 l>=r ，说明pivot的左右边的值，已经按照左边全部是小于等于pivot值
            //右边全部是大于等于pivot值
            if (l>=r){
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //如果交换完后，发现pivot，发现arr[l] == pivot值相等 r--， 前移
            if (arr[l] == pivot){
                r-=1;
            }
            //如果交换完后，发现pivot，发现arr[r] == pivot值相等 l++， 后移
            if (arr[r] == pivot){
                l+=1;
            }
        }
        //如果 l==r ,必须l++，r--，否则出现栈溢出
        if (l == r){
            l += 1;
            r -= 1;
        }
        //向左递归
        if (left <r){
            quickSort(arr,left,r);
        }
        //向右递归
        if (right>l){
            quickSort(arr,l,right);
        }
    }
}
