package jianZhiOffer01.offer23_40;

public class offer35_1 {

    public static int InversePairs(int[] array) {
        long count = 0;
        int cur = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[cur]>array[cur+1]){
                count++;
                cur++;
            }else {
                cur++;
            }
        }
        return (int) count%1000000007;
    }
    public static void main(String[] args) {
        int[] arr  = {4,3,2,1};
        int i = InversePairs(arr);
        System.out.println(i);
    }
}
