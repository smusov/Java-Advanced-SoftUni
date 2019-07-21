import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class SimpleTextEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        StringBuilder result = new StringBuilder();

        ArrayDeque<StringBuilder> lastChange = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String[] data = read.readLine().split("\\s+");

            switch (data[0]) {
                case "1":
                    lastChange.push(new StringBuilder(result));
                    result.append(data[1]);
                    break;
                case "2":
                    int size = Integer.parseInt(data[1]);
                    if (size <= result.length()) {
                        lastChange.push(new StringBuilder(result));
                        result.delete(result.length() - size, result.length());
                    }
                    break;
                case "3":

                    int num = Integer.parseInt(data[1]);
                    if (num >= 1 && num <= result.length()) {
                        System.out.println(result.toString().charAt(Integer.parseInt(data[1]) - 1));
                    }

                    break;
                case "4":
                    if (!lastChange.isEmpty()) {
                        result = lastChange.pop();
                    }
                    break;
            }
        }
    }
}
