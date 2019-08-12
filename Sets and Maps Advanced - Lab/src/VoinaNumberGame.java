import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> firstPlayer = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondPlayer = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        for (int i = 1; i <=50; i++) {

            if (firstPlayer.isEmpty()||secondPlayer.isEmpty()){
                break;
            }

            int first = firstPlayer.iterator().next();
            firstPlayer.remove(first);
            int second = secondPlayer.iterator().next();
            secondPlayer.remove(second);

            if (first>second){
                firstPlayer.add(first);
                firstPlayer.add(second);
            }else if (first<second){
                secondPlayer.add(first);
                secondPlayer.add(second);
            }else {
                firstPlayer.add(first);
                secondPlayer.add(second);
            }
        }

        if (firstPlayer.size()>secondPlayer.size()){
            System.out.println("First player win!");
        }else if (firstPlayer.size()<secondPlayer.size()){
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }

    }
}
