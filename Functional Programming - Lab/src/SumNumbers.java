import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split(", ");

        Function<String , Integer> parse = Integer::parseInt;

        System.out.println(String.format("Count = %d\nSum = %d",
                input.length ,
                Arrays.stream(input).map(parse).reduce(0, Integer::sum)));

                //Arrays.stream(input).map(parse).mapToInt(e -> e).sum()));
    }
}
