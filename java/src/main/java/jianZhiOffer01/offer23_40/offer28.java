package jianZhiOffer01.offer23_40;

public class offer28 {
    public int MoreThanHalfNum_Solution(int[] array) {
        int maj = array[0];
        for (int i = 1, cnt = 1; i < array.length; i++) {
            cnt = maj == array[i] ? cnt + 1 : cnt - 1;
            if (cnt == 0) {
                maj = array[i];
                cnt = 1;
            }
        }
        int cnt = 0;
        for (int val : array) {
            if (val == maj) {
                cnt++;
            }
        }
        return maj = cnt > (array.length / 2) ? maj : 0;
    }
}
