import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmeticOtherSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        UnaryOperator<List<Integer>> addOne = list -> list.stream().map(e-> ++e).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyByTwo = list -> list.stream().map(e-> e*=2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractOne = list -> list.stream().map(e-> --e).collect(Collectors.toList());

        String input;

        while(!"end".equals(input=read.readLine())){

            switch (input){
                case "add":
                    nums = addOne.apply(nums);
                    break;
                case "multiply":
                    nums = multiplyByTwo.apply(nums);
                    break;
                case "subtract":
                    nums = subtractOne.apply(nums);
                    break;
                case "print":
                    System.out.println(nums.toString().replaceAll("[\\[\\],]",""));
                    break;
            }

        }
    }
}
