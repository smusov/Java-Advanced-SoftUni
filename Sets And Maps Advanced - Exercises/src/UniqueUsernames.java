import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        Set<String> userNames = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            userNames.add(read.readLine());
        }
        
        userNames.forEach(System.out::println);

    }
}
