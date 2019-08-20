import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String type = read.readLine();

        Predicate<Integer> even = num->num%2==0;
        Predicate<Integer> odd = num->num%2!=0;

        IntStream
                .rangeClosed(input[0],input[1])
                .boxed()
                .filter(type.equals("even") ? even : odd )
                .forEach(e-> System.out.print(e+" "));

    }
}
