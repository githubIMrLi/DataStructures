package jianZhiOffer01.offer41_66;

public class offer44 {
    public String ReverseSentence(String str) {
        int n = str.length();
        char[] chars = str.toCharArray();
        int i = 0;
        int j = 0;
        while (j<=n){
            if (n==j||chars[j]==' '){
                revser(chars,i,j-1);
                i = j+1;
            }
            j++;
        }
        return new String(chars);
    }

    private void revser(char[] chars, int i, int j) {
        while (i<j){
            swap(chars,i++,j--);
        }
    }

    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }


}
