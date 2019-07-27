import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            firstSum+=matrix[i][i];
            secondSum+=matrix[i][matrix.length-1-i];
        }
        System.out.println(Math.abs(firstSum-secondSum));
    }
}
