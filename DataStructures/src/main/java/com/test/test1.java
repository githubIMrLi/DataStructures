package com.test;

public class test1 {
    public static void main(String[] args) {
        String str = new String(" abc de ");
        System.out.println("返回指定索引处的字符"+str.charAt(1));
        System.out.println("返回指定字符的索引"+str.indexOf("a"));
        System.out.println("字符串替换"+str.replace(" ","hh" ));
        System.out.println("去掉两端空白"+str.trim());
        str = "hello world";
        String[] split = str.split(" ");
        for (String str1 : split){
            System.out.println(str1);
        }

        System.out.println("字符串长度"+str.length());
        System.out.println("转大写"+str.toUpperCase());

    }

    //字符串反转
    private static void reverse() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcde");
        System.out.println(stringBuilder.reverse());
    }
}
