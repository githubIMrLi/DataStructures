package jianZhiOffer01.offer23_40;

public class offer31 {
    public static int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int m = 1; m <=n ; m*=10) {
            int a  = n/m;
            int b = n%m;
            cnt+= (a+8)/10*m+((a%10)==1?b+1:0);
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(13 / 10);
        System.out.println(NumberOf1Between1AndN_Solution(13));
    }
}
