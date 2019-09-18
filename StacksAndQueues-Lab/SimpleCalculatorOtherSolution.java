package StacksAndQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class SimpleCalculatorOtherSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split("\\s+");

        ArrayDeque <Integer> stack = new ArrayDeque<>();

        stack.push(Integer.parseInt(input[0]));

        for (int i = 1; i < input.length; i++) {
            if (input[i].charAt(0)=='+'){
                stack.push(stack.pop()+Integer.parseInt(input[++i]));
            }else if (input[i].charAt(0)=='-'){
                stack.push(stack.pop()-Integer.parseInt(input[++i]));
            }
        }
        System.out.println(stack.peek());
    }
}
