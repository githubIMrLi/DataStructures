package jianZhiOffer01.offer23_40;

public class offer34 {
    public static int FirstNotRepeatingChar(String str) {
        int[] cnt = new int[256];
        for (int i = 0; i < str.length(); i++) {
            //字节是可以转换成数字的，比如a = 56
            cnt[str.charAt(i)]++;

        }
        for (int i = 0; i < str.length(); i++) {
            if (cnt[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("abc".charAt(1));
        String str = "abcabcd";
        System.out.println((int)('a'));
        System.out.println(FirstNotRepeatingChar(str));
    }
}
