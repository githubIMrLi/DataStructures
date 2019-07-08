package jianZhiOffer01.offer3_10;

import java.util.ArrayList;

public class offer19 {
 /*   public ArrayList<Integer> printMatrix(int [][] matrix) {

        int ar = 0;
        int ac = 0;
        int br = matrix.length-1;
        int bc = matrix[0].length-1;

        ArrayList<Integer> list = new ArrayList<>();
        while (ar<=br&&ac<=bc){
            ArrayList<Integer> list1 = printRound(matrix, ar++, ac++, br--, bc--);
            for (int i = 0; i < list1.size(); i++) {
                list.add(list1.get(i));
            }
        }
        System.out.println(list);
        return list;

    }

    private ArrayList<Integer> printRound(int[][] matrix, int ar, int ac, int br, int bc) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (ar == br) {
            for (int i = ac; i <= bc; i++) {
                list.add(matrix[ar][i]);
            }
        } else if (ac == bc) {
            for (int i = ar; i <= br; i++) {
                list.add(matrix[i][ac]);

            }
        } else {
            int curr = ar;
            int curc = ac;
            while (curc != bc) {
                list.add(matrix[ar][curc]);
                curc++;
            }
            while (curr!=br){
                list.add(matrix[curr][bc]);
                curr++;

            }
            while (curc!=ac){
                list.add(matrix[br][curc]);
                curc--;
            }
            while (ar!=curr){
                list.add(matrix[curr][ac]);
                curr--;
            }
        }
        return list;
    }*/

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        int r1 = 0, r2 = matrix.length - 1, c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int i = c1; i <= c2; i++) {
                ret.add(matrix[r1][i]);
            }
            for (int i = r1 + 1; i <= r2; i++) {
                ret.add(matrix[i][c2]);
            }
            if (r1 != r2) {
                for (int i = c2 - 1; i >= c1; i--) {
                    ret.add(matrix[r2][i]);
                }
            }
            if (c1 != c2) {
                for (int i = r2 - 1; i > r1; i--) {
                    ret.add(matrix[i][c1]);
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ret;
    }
}
