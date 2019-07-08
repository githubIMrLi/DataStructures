package jianZhiOffer01.offer3_10;

public class offer6 {

    public int minNumberInRotateArray(int[] nums){
        if (nums.length==0){
            return 0;
        }
        int l = 0;
        int r = nums.length-1;

        while (l<r){
            int m = l+(r-l)/2;
            if (nums[m]<=nums[r]){
                r = m;
            }else {
                l = m+1;
            }
        }
        return nums[l];
    }

    public int minNumberInRotateArray1(int [] array) {
        if (array.length==0){
            return 0;
        }
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[minIndex]>array[i]){
                minIndex = i;
            }
        }

        return array[minIndex];
    }
}
