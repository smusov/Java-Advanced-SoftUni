import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        Set<String> element = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            element.addAll(Arrays.asList(read.readLine().split("\\s+")));
        }

        System.out.println(element.toString().replaceAll("[\\[\\],]",""));

    }
}
