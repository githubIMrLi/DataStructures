package com.recursion;

public class MiGong {
    public static void main(String[] args) {
        //模拟迷宫
        int[][] map = new int[8][7];

        //填充墙
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;

        //输出二维数组
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }

        setWay(map,1,1);
        System.out.println("走后地图");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static boolean setWay(int[][] map, int i, int j) {
        if (map[6][5] ==2){
            return true;
        }else {
            if (map[i][j] ==0){
                map[i][j] = 2;
                if (setWay(map,i+1, j)){
                    return true;
                }else if (setWay(map,i,j+1)){
                    return true;
                }else if (setWay(map,i-1,j)){
                    return true;
                }else if (setWay(map,i,j-1)){
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }

    }

    //使用递归回溯来给小球找路

    /**
     * 说明
     * 1. i，j表示从地图哪个位置开始出发
     * 2. 如果小球能到map[6][5]
     * 3. 约定： 当map[i][j] 为0表示该点没有走过，当1为墙，2表示通路可以走，3表示该点走过，但走不通
     * 4. 在走迷宫时需要确定一个策略（方法），下->右->上->左 ，如果走不通再回溯
     *
     * @param map 表示地图
     * @param i   i   从哪个位置开始找
     * @param j
     * @return 如果找到通路，就返回true，否则false
     */

}
