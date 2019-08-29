package CarInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i < n; i++) {
            String [] input = read.readLine().split("\\s+");

            Car car = new Car();

            car.setMake(input[0]);
            car.setModel(input[1]);
            car.setHorsePower(Integer.parseInt(input[2]));

            System.out.println(car.getInfo());
        }
    }
}
