package jianZhiOffer01.offer41_66;

public class offer65 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int[] flag = new int[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                if (helper(matrix, rows, cols, i, j, 0, str, flag)) {
                    return true;
                }
        }
        return false;
    }

    private boolean helper(char[] matrix, int rows, int cols, int i, int j, int k, char[] str, int[] flag) {
        int index = i * rows + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1)
            return false;
        if (k == str.length - 1)
            return true;
        flag[index] = 1;
        if (
                helper(matrix, rows, cols, i - 1, j, k + 1, str, flag) ||
                        helper(matrix, rows, cols, i + 1, j, k + 1, str, flag) ||
                        helper(matrix, rows, cols, i, j - 1, k + 1, str, flag) ||
                        helper(matrix, rows, cols, i, j + 1, k + 1, str, flag)) {
            return true;
        }
        flag[index] = 0;
        return false;
    }
}
