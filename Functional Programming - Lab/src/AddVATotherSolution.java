import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVATotherSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Function<Double,Double> calculateVAT = price->price*1.20;

        List<Double> totalPrices = Arrays.stream(read.readLine()
                .split(", "))
                .map(Double::parseDouble)
                .map(calculateVAT)
                .collect(Collectors.toList());

        System.out.println("Prices with VAT:");

        Consumer <Double> printPrices = price->System.out.println(String.format("%.2f",price));

        totalPrices.forEach(printPrices);


    }
}
