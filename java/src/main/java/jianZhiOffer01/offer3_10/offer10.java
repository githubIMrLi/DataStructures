package jianZhiOffer01.offer3_10;

public class offer10 {
    public int RectCover2(int target) {
        if (target <= 2) {
            return target;
        }
        int pre2 = 1;
        int pre1 = 2;
        int result = 0;
        for (int i = 3; i <= target; i++) {
            result = pre1 + pre2;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }

    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        }
        return RectCover(target - 1) + RectCover(target - 2);
    }

    public static void main(String[] args) {
        offer10 offer = new offer10();
        System.out.println(offer.RectCover(10));
        System.out.println(offer.RectCover2(10));
    }
}
