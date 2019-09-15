package EqualityLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Set<Person> people = new HashSet<>();
        Set<Person> people2 = new TreeSet<>();

        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i < n; i++) {
            String [] data = read.readLine().split("\\s+");

            Person person = new Person(data[0],Integer.parseInt(data[1]));

            people.add(person);
            people2.add(person);
        }
        System.out.println(people.size());
        System.out.println(people2.size());
    }
}
