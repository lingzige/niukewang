package niuke;

/*
* 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
* 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
* 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
* */
import java.util.ArrayList;

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        while(rows>start*2 && cols>start*2){
            printMatrixInCircle(list, matrix, cols, rows, start);
            ++start;
        }
        return list;
    }

    public void printMatrixInCircle(ArrayList<Integer> list, int[][] nums, int cols, int rows, int start){
        int endX = cols - 1 - start;
        int endY = rows - 1 - start;

        for(int i=start; i<=endX;i++){
            list.add(nums[start][i]);
        }

        if(start<endY){
            for(int i=start+1;i<=endY;i++){
                list.add(nums[i][endX]);
            }
        }

        if(start<endX && start<endY){
            for(int i=endX-1;i>=start;i--){
                list.add(nums[endY][i]);
            }
        }

        if(start<endX && start<endY-1){
            for(int i=endY-1;i>=start+1;i--){
                list.add(nums[i][start]);
            }
        }
    }
}
