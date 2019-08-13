import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        Map<String , List<Double>> grades = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            String[] input = read.readLine().split("\\s+");

            grades.putIfAbsent(input[0],new ArrayList<>());
            grades.get(input[0]).add(Double.parseDouble(input[1]));
        }

        grades.forEach((name,grade)->{
            System.out.print(name+" -> ");
            grade.forEach(e-> System.out.print(String.format("%.2f ",e)));
            System.out.print(String.format("(avg: %.2f)",calculateAverage(grade)));
            System.out.println();
        });

    }

    private static double calculateAverage(List<Double> grade) {
        double result = 0;
        for (Double num : grade) {
            result+=num;
        }
        return result/grade.size();
    }
}
