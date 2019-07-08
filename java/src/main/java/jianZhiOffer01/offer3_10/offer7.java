package jianZhiOffer01.offer3_10;

public class offer7 {
    public static int Fibonacci(int n) {
        if (n<=1){
            return n;
        }
        int pre1 = 1;
        int pre2 = 0;
        int lib = 0;
        for (int i = 2; i <=n ; i++) {
            lib = pre1+pre2;
            pre2 = pre1;
            pre1 = lib;
        }
        return lib;
    }

    public static void main(String[] args) {
        int fibonacci = Fibonacci(1);
        System.out.println(fibonacci);
    }
}
