package sort;

public class MaxGap {

    public static int maxGap(int[] nums){
        if (nums == null || nums.length<2){
            return 0;
        }
        int len = nums.length;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        //获取最大值和最小值
        for (int i = 0; i < len; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        if (min == max){
            return  0;
        }
        //创建三个数组容纳boolean，mins，maxs
        boolean[] hasNum = new boolean[len+1];
        int[] maxs = new int[len+1];
        int[] mins = new int[len+1];
        int bid = 0;
        for (int i = 0; i < len; i++) {
            //应该放入哪个桶
            bid = bucket(nums[i],len,min,max);
            mins[bid] = hasNum[bid]?Math.min(mins[bid],nums[i]):nums[i];
            maxs[bid] = hasNum[bid]?Math.max(maxs[bid],nums[i]):nums[i];
            hasNum[bid] = true;
        }
        int res = 0;
        int lastMax = maxs[0];
        int i = 1;
        for (; i <=len; i++) {
            if (hasNum[i]){
                res = Math.max(res,mins[i]-lastMax);
                lastMax = maxs[i];
            }
        }
        return res;
    }

    private static int bucket(long num, long len, long min, long max) {
        return (int)((num-min)*len/(max-min));
    }

    public static void main(String[] args) {

    }
}
