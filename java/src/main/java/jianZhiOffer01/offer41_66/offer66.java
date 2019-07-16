package jianZhiOffer01.offer41_66;

public class offer66 {
    public int movingCount(int threshold, int rows, int cols) {
        int flag[][] = new int[rows][cols];
        return helper(0,0,rows,cols,flag,threshold);
    }

    private int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {

        if (i>=rows||i<0||j<0||j>=cols||numSum(i)+numSum(j)>threshold||flag[i][j]==1)
            return 0;
        flag[i][j] = 1;
        return helper(i-1,j,rows,cols,flag,threshold)
                +helper(i+1,j,rows,cols,flag,threshold)
                +helper(i,j-1,rows,cols,flag,threshold)
                +helper(i,j+1,rows,cols,flag,threshold)
                +1;
    }

    private int numSum(int num) {
        int sum = 0;
        do {
            sum+= num%10;
        }while ((num=num/10)>0);
        return sum;
    }


}
