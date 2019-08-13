import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input = read.readLine();

        Map<Character,Integer> counts = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            counts.putIfAbsent(input.charAt(i), 0);
            counts.put(input.charAt(i), counts.get(input.charAt(i)) + 1);
        }

        counts.forEach((element,count)-> System.out.println(String.format("%s: %d time/s",element,count)));

    }
}
