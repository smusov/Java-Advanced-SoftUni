import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int pushElements = read.nextInt();
        int popElements = read.nextInt();
        int checkNumInStack = read.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < pushElements; i++) {
            stack.push(read.nextInt());
        }

        for (int i = 0; i < popElements; i++) {
            stack.pop();
        }

        if (stack.contains(checkNumInStack)){
            System.out.println(true);
            return;
        }
        if (stack.size()>0){
            int minElement = stack.stream().min(Integer::compareTo).get();
            System.out.println(minElement);
        }else {
            System.out.println(0);
        }

    }
}
