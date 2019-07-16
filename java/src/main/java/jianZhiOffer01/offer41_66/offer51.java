package jianZhiOffer01.offer41_66;

public class offer51 {
    public int[] multiply(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        for (int i = 0,pro=1; i < n;pro*=A[i], i++) {
            B[i] = pro;
        }
        for (int i = 0,pro=1; i >=0 ;pro*=A[i], i--) {
            B[i]*=pro;
        }
        return B;
    }
}
