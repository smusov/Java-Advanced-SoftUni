import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class MatchingBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String input = read.readLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i)=='('){
                stack.push(i);
            }else if (input.charAt(i)==')'){
                System.out.println(input.substring(stack.pop(),i+1));
            }

        }
    }
}

