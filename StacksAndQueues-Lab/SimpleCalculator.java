import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class SimpleCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String[] data = read.readLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = data.length - 1; i >= 0; i--) {
            stack.push(data[i]);
        }

        while (stack.size()>1){

            int firstNum = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            if (operation.equals("+")){
                stack.push(firstNum+secondNum+"");
            }else {
                stack.push(firstNum-secondNum+"");
            }
        }
        System.out.println(stack.peek());
    }
}
