package GenericBoxOfInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i < n; i++) {
            GenericBox<Integer> genericBox = new GenericBox<>(Integer.parseInt(read.readLine()));
            System.out.println(genericBox.toString());
        }

    }
}
