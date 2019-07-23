import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CompareMatrices {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[][] firstArray = new int[input[0]][input[1]];
        fillingArrays(input[0],input[1],firstArray,read);

        int[] secondInput = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        if (secondInput[0]!=input[0]||secondInput[1]!=input[1]){
            System.out.println("not equal");
            return;
        }

        int[][] secondArray = new int[secondInput[0]][secondInput[1]];
        fillingArrays(secondInput[0],secondInput[1],secondArray,read);

        if (checkEquals(firstArray,secondArray)) {
            System.out.println("equal");
        }
    }

    private static boolean checkEquals(int[][] firstArray, int[][] secondArray) {
        for (int row = 0; row < secondArray.length; row++) {

            for (int col = 0; col < secondArray[row].length; col++) {

                if (firstArray[row][col]!=secondArray[row][col]){
                    System.out.println("not equal");
                    return false;
                }

            }
        }
        return true;
    }

    private static void fillingArrays (int row , int col , int[][] array,BufferedReader read ) throws IOException {

        for (int i = 0; i < row; i++) {

            int[] nums = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            if (col >= 0){
                System.arraycopy(nums, 0, array[i], 0, col);
            }
        }
    }
}
