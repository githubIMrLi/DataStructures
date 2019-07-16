package com.recursion;

public class Queue8 {

    //设置皇后个数
    int max = 8;
    //创建数组容纳皇后
    int[] array = new int[max];

    //统计解决个数
    static int count = 0;
    //统计执行次数
    static int judgeCount = 0;

    public static void main(String[] args) {
        Queue8 queue8 = new Queue8();
        queue8.check(0);
        System.out.printf("一共有%d个解法\n", count);
        System.out.printf("一共判断冲突次数为%d次", judgeCount);
    }

    //开始放皇后
    public void check(int n){
        if (n == max) {
            print();
            return;
        }else {
           //依次放入皇后，判断是否冲突
            for (int i = 0; i < max; i++) {
                array[n] = i;
                if (judge(n)){
                    check(n+1);
                }
            }
        }
    }

    //判断冲突
    public boolean judge(int n ){  //从0开始，第n个皇后
        judgeCount++;
        for (int i = 0; i < n; i++) {       //第n个皇后要和前面的皇后判断
            if (array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;
    }

    //输出数组
    public void print(){
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
