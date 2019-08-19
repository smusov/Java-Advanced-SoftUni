import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] text = read.readLine().split("\\s+");

        Predicate<String> startingIsCapital = word -> Character.isUpperCase(word.charAt(0));

        List<String> upperCaseWords = Arrays.stream(text)
                .filter(startingIsCapital)
                .collect(Collectors.toList());

        System.out.println(upperCaseWords.size());
        System.out.println(String.join(System.lineSeparator(),upperCaseWords));

        //Consumer<String> print = System.out::println;
        //upperCaseWords.forEach(print);


    }
}
