package com.search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9};

//        int resIndex = binarySearch(arr,0,arr.length-1,7);
        List<Integer> resIndexList = binarySearch2(arr, 0, arr.length - 1, 7);

        System.out.println("resIndexList=" + resIndexList);
    }

    //二分查找

    /**
     * @param arr     数组
     * @param left    左边的索引
     * @param right   右边的索引
     * @param findVal 要查找的值
     * @return 如果找到就返回下标，没有就返回-1；
     */
    public static int binarySearch(int[] arr, int left, int right, int findVal) {
        //当left > right 时，说明递归整个数组，但是没有找到
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) { //向右递归
            return binarySearch(arr, mid + 1, right, findVal);
        } else if (findVal < mid) {
            return binarySearch(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }
    }

    //返回多个相同值的下标

    /**
     * 思路分析：
     * 1. 在找到mid 索引值，不要马上返回
     * 2. 向mid索引值的左边扫描，将所有满足的值的下标加入到ArrayList
     * 3. 向mid索引值的左边扫描，将所有满足的值的下标加入到ArrayList
     * 4. 将ArrayList返回
     */
    public static List<Integer> binarySearch2(int[] arr, int left, int right, int findVal) {
        //当left > right 时，说明递归整个数组，但是没有找到
        if (left > right) {
            return new ArrayList<Integer>();
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) { //向右递归
            return binarySearch2(arr, mid + 1, right, findVal);
        } else if (findVal < mid) {
            return binarySearch2(arr, left, mid - 1, findVal);
        } else {
            List<Integer> resIndexList = new ArrayList<Integer>();
            //向mid索引值的左边扫描，将所有满足的值的下标加入到ArrayList
            int temp = mid - 1;
            while (true) {
                if (temp < 0 || arr[temp] != findVal) {
                    break;
                }
                //否则，就temp放入resIndexList
                resIndexList.add(temp);
                temp -= 1; // temp左移
            }
            resIndexList.add(mid);

            //向mid索引值的右边扫描，将所有满足的值的下标加入到ArrayList
            temp = mid + 1;
            while (true) {
                if (temp > arr.length - 1 || arr[temp] != findVal) { //退出
                    break;
                }
                //否则，就temp放入resIndexList
                resIndexList.add(temp);
                temp += 1; // temp右移
            }
            return resIndexList;
        }

    }
}
