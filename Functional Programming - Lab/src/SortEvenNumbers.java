import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> filterNums = Arrays.stream(read.readLine().split(", ")).map(Integer::parseInt).filter(e -> e % 2 == 0).collect(Collectors.toList());

        System.out.println(filterNums.toString().replaceAll("[\\[\\]]",""));

        Collections.sort(filterNums);

        System.out.println(filterNums.toString().replaceAll("[\\[\\]]",""));

    }
}
