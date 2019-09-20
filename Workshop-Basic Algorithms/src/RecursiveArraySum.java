import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RecursiveArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        System.out.println(arraySum(array, array.length - 1));

    }

    private static int arraySum(int[] array, int index) {

        if (index==0){
            return array[index];
        }
        return array[index]+arraySum(array,--index);
    }
}
