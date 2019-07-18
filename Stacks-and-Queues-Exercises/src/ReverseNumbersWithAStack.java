import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(stack::push);

        //while (!stack.isEmpty()){
        //    System.out.print(stack.pop()+" ");
        //}

        System.out.println(String.join(" ", stack.toString().replaceAll("[\\[\\],]","")));

    }
}
