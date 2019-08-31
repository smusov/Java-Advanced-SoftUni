package CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String,List<Employee>> salaryAndDepartment = new LinkedHashMap<>();

        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = read.readLine().split("\\s+");

            Employee employee = new Employee(data[0],Double.parseDouble(data[1]),data[2],data[3]);

            if (data.length>4){

                if (!data[4].contains("@")){
                    employee.setAge(Integer.parseInt(data[4]));
                }else if (data[4].contains("@")){
                    employee.setEmail(data[4]);
                }
                if (data.length>5){
                    employee.setAge(Integer.parseInt(data[5]));
                }
            }


            salaryAndDepartment.putIfAbsent(data[3],new ArrayList<>());
            salaryAndDepartment.get(data[3]).add(employee);

        }

        String bestDepartment = "";
        double bestSalary = 0;

        for (Map.Entry<String, List<Employee>> KVP : salaryAndDepartment.entrySet()) {
            double average = KVP.getValue().stream().map(Employee::getSalary).mapToDouble(e -> e).average().getAsDouble();
            if (average>bestSalary){
                bestSalary = average;
                bestDepartment = KVP.getKey();
            }
        }
        System.out.println(String.format("Highest Average Salary: %s",bestDepartment));
        salaryAndDepartment.get(bestDepartment).stream()
                .sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))
                .forEach(e-> System.out.println(String.format("%s %.2f %s %d",e.getName(),e.getSalary(),e.getEmail(),e.getAge())));
    }
}
