package sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l<r){
            swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
            int[] p = partition(arr, l, r);

            quickSort(arr, l, p[0] - 1);
            quickSort(arr, p[1] + 1, r);
        }


    }

    //以r为标准数，将小于arr[r]的数放左边，大于放右边，等于中间
    private static int[] partition(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;

        while (l < more) {
            if (arr[l] < arr[r]) {
                swap(arr, ++less, l++);
            } else if (arr[l] > arr[r]) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        swap(arr, r, more);

        return new int[]{less+1, more};
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 6, 4,4};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
