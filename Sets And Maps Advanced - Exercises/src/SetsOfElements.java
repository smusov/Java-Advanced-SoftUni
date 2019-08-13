import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] length = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Set<Integer> firstNums = new LinkedHashSet<>(length[0]);
        Set<Integer> secondNums = new LinkedHashSet<>(length[1]);

        for (int i = 0; i < length[0]+length[1]; i++) {
            if (i<length[0]){
                firstNums.add(Integer.parseInt(read.readLine()));
            }else {
                secondNums.add(Integer.parseInt(read.readLine()));
            }
        }

        firstNums.retainAll(secondNums);
        System.out.println(firstNums.toString().replaceAll("[\\[\\],]",""));
    }
}
