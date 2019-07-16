package jianZhiOffer01.offer41_66;

public class leet81 {
    public boolean search(int[] nums, int target) {
        if(nums==null||target<0){
            return false;
        }
        for (int val : nums){
            if (val == target){
                return true;
            }
        }
        return false;
    }
}
