package jianZhiOffer01.offer23_40;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class offer27 {

    private ArrayList<String> ret = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if (str==null){
            return ret;
        }
        char[] chars = str.toCharArray();
        backtracking(chars,new boolean[chars.length],new StringBuilder());
        return ret;
    }

    private void backtracking(char[] chars, boolean[] hasUsed, StringBuilder s) {
        if (s.length()==chars.length){
            ret.add(s.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (hasUsed[i]){
                continue;
            }
            if (i!=0&&chars[i-1]==chars[i]&&!hasUsed[i-1]){
                continue;
            }
            hasUsed[i] = true;
            s.append(chars[i]);
            backtracking(chars,hasUsed,s);
            s.deleteCharAt(s.length()-1);
            hasUsed[i] = false;
        }
    }


    public static void main(String[] args) {
        String test = "abc";
        offer27 offer = new offer27();
        ArrayList<String> li = offer.Permutation(test);
        System.out.println(li);
    }
}
