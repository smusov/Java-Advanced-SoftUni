import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class PrinterQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<String> queue = new ArrayDeque<>();

        String input;
        
        while(!"print".equals(input=read.readLine())){
            
            if ("cancel".equals(input)){
                if (queue.size()==0){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println(String.format("Canceled %s",queue.poll()));
                }
            }else {
                queue.offer(input);
            }
            
        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
