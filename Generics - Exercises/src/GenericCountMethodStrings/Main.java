package GenericCountMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        List<String> elements = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            elements.add(read.readLine());
        }

        System.out.println(getCount(elements, read.readLine()));

    }
    private static <E extends Comparable<E>> int getCount (List<E> list ,E compareParameter ){

        int count = 0;

        for (E element : list) {
            if (element.compareTo(compareParameter)>0){
                count++;
            }
        }
        return count;
    }
}
