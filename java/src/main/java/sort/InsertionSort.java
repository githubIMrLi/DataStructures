package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //拷贝数组
    public static int[] copyArray(int[] arr){
        if (arr==null){
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    //判断两个数组是否正确
    public static boolean isEqual(int[] arr1,int[] arr2){
        if ((arr1 == null && arr2!= null)||(arr1!=null&&arr2==null)){
            return false;
        }
        if (arr1==null&&arr2==null){
            return true;
        }
        if (arr1.length!= arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] !=arr2[i]){
                return false;
            }
        }
        return true;
    }

    //打印
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //绝对正确的排序
    public static void rightMethod(int[] arr){
        Arrays.sort(arr);
    }

    //随机数组发生器,随机生成一个数组
    public static int[] generateRandomArray(int size,int value){
        //生成长度随机的数组
        int[] arr = new int[(int)((size+1)*Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((value+1)*Math.random())-(int)(value*Math.random());
        }
        return arr;
    }

    public static void main(String[] args) {
        int testTime = 500000;
        int size = 10;
        int value = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(size,value);
            int[] arr2 = copyArray(arr1);
            int[] arr3 = copyArray(arr1);
            insertionSort(arr1);
            rightMethod(arr2);
            if (!isEqual(arr1,arr2)){
                succeed = false;
                printArray(arr3);
                break;
            }
        }
        System.out.println(succeed? "Nice!":"Fucking fucked!");

        int[] arr = generateRandomArray(size, value);
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
    }
}
