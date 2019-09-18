package StacksAndQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<String> forward = new ArrayDeque<>();
        ArrayDeque<String> back = new ArrayDeque<>();

        String input;

        while(!"Home".equals(input=read.readLine())){

            if (input.equals("forward")){
                if (forward.size()==0){
                    System.out.println("no next URLs");
                }else {
                    back.push(forward.peek());
                    System.out.println(forward.pop());
                }

            }else if (input.equals("back")){
                if (back.size()>1){
                    forward.push(back.pop());
                    System.out.println(back.peek());
                }else {
                    System.out.println("no previous URLs");
                }
            }else {
                back.push(input);
                System.out.println(input);
                forward.clear();
            }

        }

    }
}
