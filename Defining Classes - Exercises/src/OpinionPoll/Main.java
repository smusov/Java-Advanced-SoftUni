package OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        List<Person> people = new ArrayList<>();

        while (n-->0){
            String[] data = read.readLine().split("\\s+");

            Person person = new Person(data[0],Integer.parseInt(data[1]));

            people.add(person);
        }

        Predicate<Person> filterByAge = person -> person.getAge()>30;

        people.stream().filter(filterByAge).sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);

    }
}
