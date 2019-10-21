package LinkedListTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < n; i++) {

            String[] commandTokens = read.readLine().split("\\s+");

            String command = commandTokens[0];
            int value = Integer.parseInt(commandTokens[1]);

            switch (command) {
                case "Add":
                    linkedList.add(value);
                    break;
                case "Remove":
                    linkedList.remove(value);
                    break;
            }

        }

        System.out.println(linkedList.getSize());
        for (int value : linkedList) {
            System.out.print(value + " ");
        }

    }
}
