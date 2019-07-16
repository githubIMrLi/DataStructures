package jianZhiOffer01.offer23_40;

public class offer40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int diff = 0;
        for (int num : array)
            diff ^= num;
        diff &= -diff; //判断偶数还是奇数
        for (int num : array) {
            if ((diff & num) == 0)
                num1[0] ^= num;
            else
                num2[0] ^= num;
        }
    }

    public static void main(String[] args) {
        int i = 7;
        System.out.println(i &= -i);
        System.out.println(2 & 6);
    }
}
