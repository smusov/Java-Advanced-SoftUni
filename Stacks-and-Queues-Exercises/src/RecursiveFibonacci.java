import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveFibonacci {

    private static long[] memory;

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        memory = new long[n+1];

        long result = calculateFibonacci(n);

        System.out.println(result);

    }

    private static long calculateFibonacci(int n) {

        if (n<2){
            return 1;
        }
        if (memory[n]!=0){
            return memory[n];
        }

        return memory[n]= calculateFibonacci(n-1)+calculateFibonacci(n-2);
    }
}
