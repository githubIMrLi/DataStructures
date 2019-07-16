package jianZhiOffer01.offer23_40;

public class offer30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length==0||array==null){
            return 0;
        }
        int most = Integer.MIN_VALUE;
        int sum = 0;
        for (int val : array){
            sum =sum <=0 ?val:val+sum;
            most = Math.max(sum,most);
        }
        return most;
    }
}
