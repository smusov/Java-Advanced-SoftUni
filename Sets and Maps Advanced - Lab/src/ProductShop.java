import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Map<String,Double>> prices = new TreeMap<>();
        
        String input;
        
        while(!"Revision".equals(input=read.readLine())){

            String[] data = input.split(", ");

            prices.putIfAbsent(data[0],new LinkedHashMap<>());
            prices.get(data[0]).put(data[1],Double.parseDouble(data[2]));
            
        }

        prices.forEach((key, value) -> {
            System.out.println(key + "->");
            value.forEach((key1, value1) -> System.out.println(String.format("Product: %s, Price: %.1f",key1,value1)));
        });

    }
}
