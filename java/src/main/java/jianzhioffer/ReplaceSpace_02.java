package jianzhioffer;

public class ReplaceSpace_02 {
    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        String replace = s.replace(" ", "%20");

        return replace;
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello world");
        ReplaceSpace_02 replaceSpace = new ReplaceSpace_02();
        String s = replaceSpace.replaceSpace(stringBuffer);
        System.out.println(s);

        String str1 = "hello world";
        str1.replace(" ","%20");
        System.out.println(str1);
    }
}
