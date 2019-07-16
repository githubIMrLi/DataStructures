package jianZhiOffer01.offer23_40;

public class offer37 {
    /*public int GetNumberOfK(int [] array , int k) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==k){
                count++;
            }
        }
        return count;
    }*/

    public int GetNumberOfK(int[] array, int k) {
        int first = binarySearch(array, k);
        int last = binarySearch(array, k + 1);
        return (first == array.length || array[first] != k) ? 0 : last - first;
    }

    private int binarySearch(int[] array, int k) {
        int l = 0, h = array.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (array[m] >= k)
                h = m;
            else
                l = m + 1;
        }
        return l;
    }
}
