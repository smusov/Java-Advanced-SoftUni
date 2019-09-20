import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(read.readLine());

        System.out.println(calculateFactorial(n));

    }

    private static long calculateFactorial(long n) {

        if (n==1){
            return n;
        }
        return n*calculateFactorial(n-1);
    }
}
