import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int n = Integer.parseInt(read.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            switch (read.nextInt()){
                case 1:
                    stack.push(read.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    if (stack.size()>0){
                        System.out.println(stack.stream().max(Integer::compareTo).get());
                    }
                    break;
            }
        }
    }
}
