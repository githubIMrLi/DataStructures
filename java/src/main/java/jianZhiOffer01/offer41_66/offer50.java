package jianZhiOffer01.offer41_66;

public class offer50 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        int[] assist = new int[length];
        for (int i = 0; i < length; i++) {
            if (assist[numbers[i]]==0){
                assist[numbers[i]]++;
            }else {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
