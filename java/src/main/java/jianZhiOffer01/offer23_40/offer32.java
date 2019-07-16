package jianZhiOffer01.offer23_40;



import java.util.Arrays;

public class offer32 {
    /**
     *1. 先将numbers数组加入字符串数组，
     * 2. 进行排序
     * 3. 拼接即可。
     */
    public static String PrintMinNumber(int[] numbers) {
        if (numbers==null||numbers.length==0){
            return "";
        }
        int n = numbers.length;
        String[] str = new String[n];
        for (int i = 0; i < numbers.length; i++) {
            str[i] = numbers[i]+"";
        }
        Arrays.sort(str,(o1,o2)->(o1+o2).compareTo(o2+o1));
        String ret = "";
        for (String val : str){
            ret+= val;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] numbers = {3,32,321};
        System.out.println(PrintMinNumber(numbers));
    }
}
