package jianZhiOffer01.offer23_40;

public class offer33 {
    public static int GetUglyNumber_Solution(int index) {
        if (index<=6){
            return index;
        }
        int i2=0,i3=0,i5=0;
        int[] dp = new int[index];
        dp[0]=1;
        for (int i = 1; i < index; i++) {
            int next2 = dp[i2]*2;
            int next3 = dp[i3]*3;
            int next5 = dp[i5]*5;
            dp[i] = Math.min(next2,Math.min(next3,next5));
            if (next2==dp[i]){
                i2++;
            }
            if (next3==dp[i]){
                i3++;
            }
            if (next5==dp[i]){
                i5++;
            }
        }
        return dp[index-1];
    }

    public static void main(String[] args) {
        int i = GetUglyNumber_Solution(9);
        System.out.println(i);
    }
}
