import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Double> input = Arrays.stream(read.readLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        Map<String,Integer> counts = new LinkedHashMap<>();

        for (Double num : input) {

            String formattedNum = String.format("%.1f -> ", num);

            counts.putIfAbsent(formattedNum,0);
            counts.put(formattedNum,counts.get(formattedNum)+1);
        }

        counts.forEach((num,count)-> System.out.println(num+count));
    }
}
