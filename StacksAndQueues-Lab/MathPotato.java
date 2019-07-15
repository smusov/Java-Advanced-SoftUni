import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class MathPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] names = read.readLine().split("\\s+");
        int n = Integer.parseInt(read.readLine());

        ArrayDeque <String> queue = new ArrayDeque<>();

        for (String name : names) {
            queue.offer(name);
        }

        String primeNums = "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113";

        List<String> prime = Arrays.asList(primeNums.split("\\s+"));


        int row = 1;

        while (queue.size()>1){
            for (int i = 1; i < n ; i++) {
                queue.offer(queue.poll());
            }

            if (!prime.contains(row+"")){
                System.out.println("Removed "+queue.pop());
            }else {
                System.out.println("Prime "+queue.peek());
            }
            row++;
        }
        System.out.println("Last is "+queue.peek());
    }
}
