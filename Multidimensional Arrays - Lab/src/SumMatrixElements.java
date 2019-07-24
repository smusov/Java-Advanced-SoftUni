import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumMatrixElements {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] rowsAndCols = Arrays.stream(read.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        
        int[][] matrix = new int[rowsAndCols[0]][rowsAndCols[1]];

        for (int i = 0; i < rowsAndCols[0]; i++) {
            int [] nums = Arrays.stream(read.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

            for (int j = 0; j < rowsAndCols[1]; j++) {
                matrix[i][j] = nums[j];
            }
        }

        int sum = 0;

        for (int[] num : matrix) {
            sum+= Arrays.stream(num).sum();
        }
        System.out.println(rowsAndCols[0]);
        System.out.println(rowsAndCols[1]);
        System.out.println(sum);
    }
}
