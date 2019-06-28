import java.util.Arrays;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        List<int[]> list = Arrays.asList(arr);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.get(0).toString().getBytes());
        for (int i = 0; i < list.get(0).length; i++) {
            System.out.println(list.get(0).toString());
        }
    }
}
