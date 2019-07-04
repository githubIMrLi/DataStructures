public class ReverseStr {

    public static String stringBufferReverse(String str){
        return new StringBuffer(str).reverse().toString();
    }

    public static String charArrayReverse(String str){
        char[] chars = str.toCharArray();
        String reverse = "";
        for (int i = chars.length-1; i >=0 ; i--) {
            reverse += chars[i];
        }
        return reverse;
    }

    //递归
    public static String reverse6(String str){
        int len = str.length();
        if (len<=1){
            return str;
        }
        String left = str.substring(0,len/2);
        String right = str.substring(len/2,len);

        return reverse6(right)+reverse6(left);

    }


    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(stringBufferReverse(str));
        System.out.println(charArrayReverse(str));
        System.out.println(reverse6(str));
    }
}
