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
            filling(matrix,size,false);
        } else {
            filling(matrix,size,true);
        }

        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(matrix[i]).replaceAll("[\\[\\],]",""));
        }
    }

    private static void filling (int[][] matrix, int size,boolean type){
        if (type){
            while (index!=size){
                forward(matrix,size);
                if (index==size){
                    break;
                }
                back(matrix, size);
            }
        }else {
            while (index!=size){
                forward(matrix,size);
            }
        }
    }

    private static void forward(int[][] matrix, int size) {

        for (int j = 0; j < size; j++) {
            matrix[j][index] = counter++;
        }
        index++;
    }
    private static void back (int[][] matrix, int size){
        for (int i = size-1; i >= 0; i--) {
            matrix[i][index] = counter++;
        }
        index++;
    }
}
