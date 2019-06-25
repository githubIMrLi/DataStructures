package sort;

public class NetherLandsFlag {

    public static int[] partition(int[] arr, int L, int R, int num){
        int less = L -1;
        int more = R +1;
        int cur = L;
        while (cur <more){
            if (arr[cur]< num){
                //把++less和cur位置交换
                swap(arr,++less, cur++);
            }else if (arr[cur]> num){
                swap(arr,--more, cur);
            }else {
                cur++;
            }
        }
        return new int[]{less+1,more-1};
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {

    }
}
