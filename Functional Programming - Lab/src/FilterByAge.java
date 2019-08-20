import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterByAge {
    public static void main(String[] args) throws IOException {


        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int peopleCount = Integer.parseInt(read.readLine());

        Map<String,Integer> peoples = new LinkedHashMap<>();

        for (int i = 0; i < peopleCount; i++) {
            String[] input = read.readLine().split(", ");

            peoples.put(input[0],Integer.parseInt(input[1]));

        }

        String condition = read.readLine();
        int year = Integer.parseInt(read.readLine());
        String format = read.readLine();

        BiPredicate<Map.Entry<String,Integer> , Integer> high = (person,limit)->person.getValue()<=limit;
        BiPredicate<Map.Entry<String,Integer> , Integer> low = (person,limit)->person.getValue()>=limit;

        Consumer<Map.Entry<String,Integer>> printName = person -> System.out.println(person.getKey());
        Consumer<Map.Entry<String,Integer>> printAge = person -> System.out.println(person.getValue());
        Consumer<Map.Entry<String,Integer>> printNameAndAge = person -> System.out.println(person.getKey()+" - "+person.getValue());

        peoples.entrySet().stream()
                .filter(person->condition.equals("younger")?high.test(person,year):low.test(person,year))
                .forEach(person -> {
                    if (format.equals("age")) {
                        printAge.accept(person);
                    }else if (format.equals("name")){
                        printName.accept(person);
                    }else {
                        printNameAndAge.accept(person);
                    }
                });

    }
}
