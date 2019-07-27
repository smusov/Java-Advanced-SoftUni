import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FillTheMatrix {

    private static int counter = 1;
    private static int index = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] data = read.readLine().split(", ");

        int size = Integer.parseInt(data[0]);
        String pattern = data[1];

        int[][] matrix = new int[size][size];

        if (pattern.equals("A")) {
            filling(matrix,false);
        } else {
            filling(matrix,true);
        }

        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(matrix[i]).replaceAll("[\\[\\],]",""));
        }
    }

    private static void filling (int[][] matrix,boolean type){
        if (type){
            while (index!=matrix.length){
                forward(matrix);
                if (index==matrix.length){
                    break;
                }
                back(matrix);
            }
        }else {
            while (index!=matrix.length){
                forward(matrix);
            }
        }
    }

    private static void forward(int[][] matrix) {

        for (int j = 0; j < matrix.length; j++) {
            matrix[j][index] = counter++;
        }
        index++;
    }
    private static void back (int[][] matrix){
        for (int i = matrix.length-1; i >= 0; i--) {
            matrix[i][index] = counter++;
        }
        index++;
    }
}
