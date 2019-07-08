package jianZhiOffer01.offer3_10;

public class offer11 {

    public int NumberOf1(int n) {
        return Integer.bitCount(n);
    }


    public static void main(String[] args) {
        offer11 offer = new offer11();
        System.out.println(offer.NumberOf1(3));
    }
}
