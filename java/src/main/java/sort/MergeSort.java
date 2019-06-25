package sort;

import java.util.Arrays;

public class MergeSort {



    public static void main(String[] args) {
        int[] arr= {5,3,1,2,6};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr) {
        if (arr==null||arr.length<2){
            return;
        }
        mergeSort(arr,0,arr.length-1);

    }

    private static void mergeSort(int[] arr,int l,int r){
        if (l ==r){
            return;
        }
        int m = (l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        sort(arr,l,m,r);
    }

    private static void sort(int[] arr,int l,int m, int r) {
        int[] help = new int[r-l+1];
        int t=0;
        int p1 = l;
        int p2 = m+1;

        while (p1<=m&&p2<=r){
            help[t++] = arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1<=m){
            help[t++] = arr[p1++];
        }
        while (p2<=r){
            help[t++] = arr[p2++];
        }

        for (int i = 0; i < help.length; i++) {
            arr[i+l] = help[i];
        }
    }
}
