package jianZhiOffer01.jianzhioffer;

import java.util.ArrayList;

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {

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
    }

    public static void main(String[] args) {
//        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
//                { 13, 14, 15, 16 } };
        int[][] matrix = {{1,2,3}};
        PrintMatrix printMatrix1 = new PrintMatrix();
        printMatrix1.printMatrix(matrix);
    }
}
