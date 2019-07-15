import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class HotPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] names = read.readLine().split("\\s+");
        int n = Integer.parseInt(read.readLine());

        ArrayDeque <String> queue = new ArrayDeque<>();

        for (String name : names) {
            queue.offer(name);
        }

        while (queue.size()>1){
            for (int i = 1; i < n ; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed "+queue.pop());
        }
        System.out.println("Last is "+queue.peek());
    }
}