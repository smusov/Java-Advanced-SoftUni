import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        Map<String,Map<String, List<String>>> cities = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = read.readLine().split("\\s+");

            cities.putIfAbsent(input[0],new LinkedHashMap<>());
            cities.get(input[0]).putIfAbsent(input[1],new ArrayList<>());
            cities.get(input[0]).get(input[1]).add(input[2]);

        }

        cities.forEach((continents,countries )->{
            System.out.println(String.format("%s: ",continents));
            countries.forEach((country,town)->
                    System.out.println(String.format("%s -> %s",country,town.toString().replaceAll("[\\[\\]]",""))));
        });

    }
}
