package jianzhioffer;

public class Find_01 {
    public boolean Find(int target, int [][] array) {
        int row = 0;
        int col = array[0].length-1;
        while (row<=array.length-1&&col>=0){
            if (array[row][col]>target){
                col--;
            }else if (array[row][col]<target){
                row++;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Find_01 solution = new Find_01();
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(solution.Find(9, matrix));

    }
}

