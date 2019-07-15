import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BrowserHistory {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<String> stack = new ArrayDeque<>();

        String input;
        
        while(!"Home".equals(input=read.readLine())){
            
            if (input.equals("back")){
                if (stack.size()>1){
                    stack.pop();
                    System.out.println(stack.peek());
                }else {
                    System.out.println("no previous URLs");
                }
            }else {
                stack.push(input);
                System.out.println(stack.peek());
            }
        }
    }
}
