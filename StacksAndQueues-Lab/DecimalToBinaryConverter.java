import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class DecimalToBinaryConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Long> stack = new ArrayDeque<>();

        long num = Integer.parseInt(read.readLine());

        if (num==0){
            stack.push((long) 0);
        }

        while (num!=0){
            stack.push(num%2);
            num/=2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
