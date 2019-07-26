import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        int [] [] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i]+" ");
        }

        System.out.println();

        int cols = n;

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[--cols][i]+" ");
        }
    }
}
