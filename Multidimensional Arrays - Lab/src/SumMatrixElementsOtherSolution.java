import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumMatrixElementsOtherSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int [] rowCols = Arrays.stream(read.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        for (int i = 0; i < rowCols[0]; i++) {
            sum+=Arrays.stream(read.readLine().split(", ")).mapToInt(Integer::parseInt).sum();
        }

        System.out.println(String.format("%d\n%d\n%d",rowCols[0],rowCols[1],sum));

    }
}
