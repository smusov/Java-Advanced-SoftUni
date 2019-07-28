import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatrixShuffling {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] rowCol = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[rowCol[0]][rowCol[1]];

        for (int i = 0; i < rowCol[0]; i++) {
            matrix[i] = read.readLine().split("\\s+");
        }

        String input;

        while(!"END".equals(input=read.readLine())){

            String[] data = input.split("\\s+");

            if (data.length==5&&data[0].equals("swap")){

                int firstRow = Integer.parseInt(data[1]);
                int firstCol = Integer.parseInt(data[2]);

                int secondRow = Integer.parseInt(data[3]);
                int secondCol = Integer.parseInt(data[4]);

                if (checkValidIndex(firstRow,firstCol,secondRow,secondCol,rowCol)){

                    String firstValue = matrix[firstRow][firstCol];
                    String secondValue = matrix[secondRow][secondCol];

                    matrix[firstRow][firstCol] = secondValue;
                    matrix[secondRow][secondCol] = firstValue;

                    printMatrix(matrix);

                }else {

                    System.out.println("Invalid input!");
                }
            }else {

                System.out.println("Invalid input!");
            }

        }

    }

    private static void printMatrix(String[][] matrix) {
        for (String[] element : matrix) {

            System.out.println(Arrays.toString(element).replaceAll("[\\[\\],]", ""));
        }
    }

    private static boolean checkValidIndex(int firstRow, int firstCol, int secondRow, int secondCol, int[] rowCol) {
        if (firstRow>=0&&firstRow<rowCol[0]&&firstCol>=0&&firstCol<rowCol[1]){

            return secondRow >= 0 && secondRow < rowCol[0] && secondCol >= 0 && secondCol < rowCol[1];

        }

        return false;
    }
}
