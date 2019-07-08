package jianZhiOffer01.jianzhioffer;

public class MinNumberInRotateArrayDemo {
    public int minNumberInRotateArray(int [] array) {
        if (array.length==0){
            return 0;
        }
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[minIndex]>array[i]){
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        MinNumberInRotateArrayDemo number = new MinNumberInRotateArrayDemo();
        int[] arr = {3,4,5,1,2};
        int minIndex = number.minNumberInRotateArray(arr);
        System.out.println(minIndex);

    }
}
