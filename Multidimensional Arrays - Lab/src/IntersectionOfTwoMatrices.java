import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(read.readLine());
        int col = Integer.parseInt(read.readLine());

        char[][] firstMatrix = new char[rows][col];
        char[][] secondMatrix = new char[rows][col];

        for (int i = 0; i < rows*2; i++) {
            String[] data = read.readLine().split("\\s+");
            for (int j = 0; j < data.length; j++) {
                if (i<rows){
                    firstMatrix[i][j]=data[j].charAt(0);
                }else {
                    secondMatrix[i-rows][j] = data[j].charAt(0);
                }
            }
        }
       char[][] result = new char[rows][col];

        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                if (firstMatrix[i][j]!=(secondMatrix[i][j])){
                    result[i][j] = '*';
                }else {
                    result[i][j]=firstMatrix[i][j];
                }
            }
        }
        for (char[] element : result) {
            System.out.println(Arrays.toString(element).replaceAll("[\\[\\],]",""));
        }
    }
}
