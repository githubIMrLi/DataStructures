package jianZhiOffer01.offer23_40;

public class offer23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }

    private boolean verify(int[] sequence, int first, int last) {

        if (last - first <= 1) {
            return true;
        }
        int val = sequence[last];
        int curIndex = first;
        while (curIndex < last && sequence[curIndex] <= val) {
            curIndex++;
        }
        for (int i = curIndex; i < last; i++) {
            if (sequence[i] < val) {
                return false;
            }
        }
        return verify(sequence, first, curIndex - 1) && verify(sequence, curIndex, last - 1);

    }

}
