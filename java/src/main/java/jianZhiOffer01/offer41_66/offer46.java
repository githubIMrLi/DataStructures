package jianZhiOffer01.offer41_66;

public class offer46 {
    public static int LastRemaining_Solution(int n, int m) {
       if (n==0)
           return -1;
       if (n==1)
           return 0;
       return (LastRemaining_Solution(n-1,m)+m)%n;
    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(9, 2));
    }
}
