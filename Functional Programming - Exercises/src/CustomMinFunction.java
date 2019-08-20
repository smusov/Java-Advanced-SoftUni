import java.util.Arrays;
import java.util.Scanner;

public class CustomMinFunction {
    public static void main(String[] args) {

        Arrays.stream(new Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).min().stream().forEach(System.out::println);

        //Other Solution :

        //BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
        //
        //int[] nums = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        //Function <int[],Integer> minNum = num ->{
        //    return Arrays.stream(num).min().getAsInt();
        //};

        //System.out.println(minNum.apply(nums));

    }
}
