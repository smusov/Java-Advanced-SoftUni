import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PositionsOf {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] rowCows = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[][] nums = new int[rowCows[0]][rowCows[1]];

        for (int i = 0; i < rowCows[0]; i++) {
            nums[i] = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int searchNum = Integer.parseInt(read.readLine());

        boolean isFound = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j]==searchNum){
                    isFound=true;
                    System.out.println(i+" "+j);
                }

            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
