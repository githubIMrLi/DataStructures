package jianzhioffer02;

import java.util.ArrayList;

public class GetLeastNumbers_SolutionDemo {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (k < 0 || k > input.length) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();

        bubbleSort(input);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        GetLeastNumbers_SolutionDemo getL = new GetLeastNumbers_SolutionDemo();
        ArrayList<Integer> list = getL.GetLeastNumbers_Solution(arr, 10);
        System.out.println(list);
        ;
    }
}
