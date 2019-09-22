package MultidimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WrongMeasurements {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int rowCol = Integer.parseInt(read.readLine());

        int [][] matrix = new int [rowCol][];

        for (int i = 0; i < rowCol; i++) {
            matrix[i] = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int[] wrongRowCol = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int wrongValue = matrix[wrongRowCol[0]][wrongRowCol[1]];

        List<Integer> value = new ArrayList<>();
        List<int[]> indexes = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==wrongValue){
                    int validValue = getValidValue(matrix,i,j,wrongValue);
                    value.add(validValue);
                    indexes.add(new int[]{i,j});
                }
            }
        }
        for (int i = 0; i < value.size(); i++) {
            matrix[indexes.get(i)[0]][indexes.get(i)[1]] = value.get(i);
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]).replaceAll("[\\[\\],]",""));
        }
    }

    private static int getValidValue(int[][] matrix, int row, int col, int wrongValue) {
        int sum = 0;

        if (isValidIndex(row-1,col,matrix)&&matrix[row-1][col]!=wrongValue){
            sum+=matrix[row-1][col];
        }
        if (isValidIndex(row+1,col,matrix)&&matrix[row+1][col]!=wrongValue){
            sum+=matrix[row+1][col];
        }
        if (isValidIndex(row,col+1,matrix)&&matrix[row][col+1]!=wrongValue){
            sum+=matrix[row][col+1];
        }
        if (isValidIndex(row,col-1,matrix)&&matrix[row][col-1]!=wrongValue){
            sum+=matrix[row][col-1];
        }
        return sum;
    }
    private static boolean isValidIndex(int row,int col,int [][] matrix){
        return row>=0&&row<matrix.length && col>=0 && col<matrix[row].length;
    }
}
