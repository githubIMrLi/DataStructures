package jianZhiOffer01.offer41_66;

public class offer49 {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0)
            return 0;
        boolean isNegative = str.charAt(0) == '-';
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '0' || c == '+' || c == '-')
                continue;
            if (c > '9' || c < '0')
                return 0;
            ret = ret * 10 + c-'0';
        }
        return isNegative ? -ret : ret;
    }

    public static void main(String[] args) {
        System.out.println((int) '1');
        System.out.println((int) '0');
    }
}
