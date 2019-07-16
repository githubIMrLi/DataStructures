package jianZhiOffer01.offer23_40;

public class offer35 {


    private long cnt = 0;
    private int[] tmp;

    public int InversePairs(int[] array) {
        tmp = new int[array.length];
        mergeSort(array, 0, array.length - 1);
        return (int) (cnt % 1000000007);
    }

    private void mergeSort(int[] array, int l, int h) {
        if (h - l < 1)
            return;
        int m = l + (h - l) / 2;
        mergeSort(array, l, m);
        mergeSort(array, m + 1, h);
        merge(array, l, m, h);
    }

    private void merge(int[] array, int l, int m, int h) {
        int i = l;
        int k = l;
        int j = m+1;
        while (i<=m||j<=h){
            if (i>m)
                tmp[k] = array[j++];
            else if (j>h)
                tmp[k] = array[i++];
            else if (array[i]<=array[j])
                tmp[k] = array[i++];
            else {
                tmp[k] = array[j++];
                cnt += m-i+1;
            }
            k++;
        }
        for (k = l; k <=h ; k++) {
            array[k] = tmp[k];
        }
    }

    public static void main(String[] args) {
        offer35 offer = new offer35();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 0};
        int i = offer.InversePairs(arr);
        System.out.println(i);
    }
}
