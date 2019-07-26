import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] rowsAndCols = Arrays.stream(read.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[rowsAndCols[0]][rowsAndCols[1]];

        for (int i = 0; i < rowsAndCols[0]; i++) {

            matrix[i] = Arrays.stream(read.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        }

        int maxSum = Integer.MIN_VALUE;

        List<Integer> bestNum = new ArrayList<>();

        for (int i = 0; i < rowsAndCols[0] - 1; i++) {
            for (int j = 0; j < rowsAndCols[1] - 1; j++) {
                int sum = matrix[i][j] + matrix[i + 1][j + 1] + matrix[i][j + 1] + matrix[i + 1][j];
                if (sum>maxSum){
                    maxSum=sum;
                    bestNum.clear();
                    bestNum.add(matrix[i][j]);
                    bestNum.add(matrix[i][j + 1]);
                    bestNum.add(matrix[i + 1][j]);
                    bestNum.add(matrix[i + 1][j + 1]);
                }
            }
        }
        System.out.println(String.format("%d %d\n%d %d\n%d"
                ,bestNum.get(0),bestNum.get(1),
                bestNum.get(2),bestNum.get(3),maxSum));
    }
}
