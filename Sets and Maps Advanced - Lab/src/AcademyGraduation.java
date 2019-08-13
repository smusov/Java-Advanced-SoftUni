import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        Map<String, List<Double>> studentGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            String name = read.readLine();
            List<Double> grades = Arrays.stream(read.readLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

            studentGrades.putIfAbsent(name,new ArrayList<>());
            studentGrades.get(name).addAll(grades);

        }

        studentGrades.forEach((name,grades)-> System.out.println(String.format("%s is graduated with %s",name,calculateAverage(grades))));

    }
    private static double calculateAverage(List<Double> grade) {
        double result = 0;
        for (Double num : grade) {
            result+=num;
        }
        return result/grade.size();
    }
}
