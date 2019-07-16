package jianZhiOffer01.offer41_66;

import java.util.Arrays;

public class offer45 {
    public boolean isContinuous(int[] numbers) {
        if (numbers.length < 5)
            return false;
        Arrays.sort(numbers);
        int cnt = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0)
                cnt++;
        }

        for (int i = cnt; i < numbers.length; i++) {
            if (numbers[i] == numbers[i + 1])
                return false;
            cnt -= numbers[i + 1] - numbers[i] - 1;
        }
        return cnt >= 0;
    }
}
