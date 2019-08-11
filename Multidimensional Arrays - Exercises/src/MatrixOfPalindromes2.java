import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatrixOfPalindromes2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] rowCol = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[rowCol[0]][rowCol[1]];

        char first = 'a';

        for (int i = 0; i < rowCol[0]; i++) {

            char second = first;

            for (int j = 0; j < rowCol[1]; j++) {

                matrix[i][j] = first+""+second+""+first;
                second+=1;
            }
            first+=1;
        }
        for (String[] element : matrix) {
            System.out.println(Arrays.toString(element).replaceAll("[\\[\\],]",""));
        }
    }
}
