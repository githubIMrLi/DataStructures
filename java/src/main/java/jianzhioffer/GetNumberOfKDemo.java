package jianzhioffer;

public class GetNumberOfKDemo {
    public int GetNumberOfK(int [] array , int k) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        GetNumberOfKDemo getNumberOfKDemo = new GetNumberOfKDemo();
        int i = getNumberOfKDemo.GetNumberOfK(arr, 3);
        System.out.println(i);
    }
}
