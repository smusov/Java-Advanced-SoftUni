import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int offerElements = read.nextInt();
        int pollElements = read.nextInt();
        int checkNumInQueue = read.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < offerElements; i++) {
            queue.offer(read.nextInt());
        }

        for (int i = 0; i < pollElements; i++) {
            queue.poll();
        }

        if (queue.contains(checkNumInQueue)){
            System.out.println(true);
            return;
        }
        if (queue.size()>0){
            int minElement = queue.stream().min(Integer::compareTo).get();
            System.out.println(minElement);
        }else {
            System.out.println(0);
        }

    }
}
