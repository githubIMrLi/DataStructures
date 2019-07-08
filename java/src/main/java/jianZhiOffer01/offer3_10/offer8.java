package jianZhiOffer01.offer3_10;

public class offer8 {



    public int JumpFloor(int target) {
        if (target <= 2) {
            return target;
        }
        int pre1 = 2;
        int pre2 = 1;
        int result = 0;
        for (int i = 3; i <= target; i++) {
            result = pre1 + pre2;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
