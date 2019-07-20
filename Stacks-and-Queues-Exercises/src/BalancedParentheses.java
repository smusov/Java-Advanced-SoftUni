import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BalancedParentheses {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split("");

        ArrayDeque<String> parentheses = new ArrayDeque<>();

        List<String> closeParentheses = new ArrayList<>(Arrays.asList("}",")","]"));
        List<String> balanced = new ArrayList<>(Arrays.asList("{}","()","[]"));

        for (String element : input) {

            if (!closeParentheses.contains(element)){
                parentheses.push(element);

            }else if (input.length%2==0){

                if (parentheses.size()>0){
                    String nowParentheses = parentheses.pop()+element;

                    if (!balanced.contains(nowParentheses)){
                        System.out.println("NO");
                        return;
                    }
                }else {
                    System.out.println("NO");
                    return;
                }
            }else {
                System.out.println("NO");
                return;
            }
        }
        if (parentheses.size()==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

