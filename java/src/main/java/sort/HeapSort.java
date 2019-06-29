package sort;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int arr[]){
        if (arr==null||arr.length<2){
            return;
        }

        //生成一个最大堆
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr,i);
        }

        //每次取出最后一个
        int size = arr.length;
        swap(arr,0,--size);
        while (size>0){
            //调整堆，因为取出了最大的
            heapify(arr,0,size);
            swap(arr,0,--size);
        }
    }

    private static void heapify(int[] arr, int index, int size) {
        int left = index*2+1;

        while (left<size){
            int largest = arr[left+1]>arr[left]?left+1:left;
            largest = arr[largest]>arr[index]?largest:index;
            if (index == largest){
                break;
            }
            swap(arr,largest,index);
            index = largest;
            left = index*2+1;
        }


    }

    //生成最大堆
    private static void heapInsert(int[] arr, int index) {

        while (arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
            index = (index-1)/2;
        }
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 1, 3, 4, 7};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
