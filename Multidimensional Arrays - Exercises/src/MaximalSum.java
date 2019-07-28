import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximalSum {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] rowCol = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[rowCol[0]][rowCol[1]];

        for (int i = 0; i < rowCol[0]; i++) {
            matrix[i] = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        int endRow = -1;
        int endCol = -1;

        for (int row = 1; row < rowCol[0]-1; row++) {
            for (int col = 1; col <rowCol[1]-1; col++) {
                int nowSum = nowMatrixSum(matrix,row,col);
                if (nowSum>maxSum){

                    maxSum=nowSum;

                    endRow=row;
                    endCol=col;
                }
            }
        }
        System.out.println(String.format("Sum = %d",maxSum));
        printMatrix (matrix,endRow,endCol);
    }

    private static void printMatrix(int[][] matrix, int endRow, int endCol) {

       int startRow = endRow-1;
       int startCol = endCol-1;

        for (int i = startRow; i <=endRow+1; i++) {
            for (int j = startCol; j <=endCol+1; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static int nowMatrixSum(int[][] matrix, int row, int col) {
        int sum = 0;

        sum+=matrix[row][col];
        sum+=matrix[row-1][col-1];
        sum+=matrix[row+1][col+1];
        sum+=matrix[row][col-1];
        sum+=matrix[row+1][col-1];
        sum+=matrix[row+1][col];
        sum+=matrix[row][col+1];
        sum+=matrix[row-1][col+1];
        sum+=matrix[row-1][col];

        return sum;
    }
}

