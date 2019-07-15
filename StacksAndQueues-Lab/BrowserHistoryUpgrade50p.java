import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        String input;


        while (!"Home".equals(input = read.readLine())) {

            if (input.equals("back")) {
                
                if (stack.size() >= 1) {
                    queue.offer(stack.peek());
                    stack.pop();
                    System.out.println(stack.peek());
                }
            } else if (input.equals("forward")) {

                if (queue.size() >= 1) {
                    stack.push(queue.peek());
                    System.out.println(queue.poll());
                } else {
                    System.out.println("no next URLs");
                }

            } else {
                stack.push(input);
                System.out.println(stack.peek());
            }
        }
    }
}
