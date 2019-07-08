package sort;

import java.util.Arrays;

public class HeapSort {

    public static int heapSort(int arr[],int k) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        //生成一个最大堆
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }

        //通过每次取出头节点，然后头节点和尾结点进行交换，--size
        int size= arr.length;
        swap(arr,0,--size);
        while (size>0){
            heapify(arr,0,size);
            swap(arr,0,--size);
        }
        return arr[k-1];
    }


    /**
     * 1. 当大根堆里的值有变化时，找到两个子节点中最大的值，和节点比较。
     * 如果子节点比节点大，就交换。
     */
    private static void heapify(int[] arr, int index, int size) {
        int left = index * 2 + 1;

        while (left < size) {
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[index] > arr[largest] ? index : largest;
            if (largest == index) {
                break;
            }
            swap(arr, index, largest);
            index = largest;  //index到largest指向的位置
            left = index * 2 + 1;
        }
    }

    //生成最大堆
    private static void heapInsert(int[] arr, int index) {
        //只要index位置比父位置数大，就交换，然后index往上跑
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 1, 3, 4, 7};
        /*System.out.println(Arrays.toString(arr));
        heapSort(arr,2);
        System.out.println(Arrays.toString(arr));*/
        System.out.println(heapSort(arr,2));

    }
}
