package jianZhiOffer01.jianzhioffer;

public class JumpFloor {
    public int JumpFloor(int target) {
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            return (int) Math.pow(2, JumpFloor(target - 1));
        }
    }

    public int JumpFloorII(int target) {
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        }else {
            return 2*JumpFloorII(target-1);
        }
    }

    public static void main(String[] args) {
        JumpFloor jumpFloor = new JumpFloor();
        int i = jumpFloor.JumpFloor(2);
        System.out.println(i);

    }
}
