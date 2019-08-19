import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Double> input = Arrays.stream(read.readLine().split(", ")).map(Double::parseDouble).collect(Collectors.toList());

        UnaryOperator<Double> VAT = value -> value*1.2;

        System.out.println("Prices with VAT:");

        for (Double price : input) {
            System.out.println(String.format("%.2f",VAT.apply(price)));
        }


    }
}
