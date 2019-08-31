package SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        Map<String,Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = read.readLine().split("\\s+");
            Car car = new Car(data[0],Integer.parseInt(data[1]),Double.parseDouble(data[2]));
            cars.put(data[0],car);
        }

        String input;
        
        while(!"End".equals(input=read.readLine())){
        
            String[] data = input.split("\\s+");

            int distance = Integer.parseInt(data[2]);
            double fuel = cars.get(data[1]).needFuelForDistance(distance);

            if (fuel>=0) {
                cars.get(data[1]).setDistanceTraveled(distance);
                cars.get(data[1]).setFuelAmount(fuel);
            }else {
                System.out.println("Insufficient fuel for the drive");
            }
        }
        cars.forEach((key,value)-> System.out.println(value.printByPattern()));
    }
}
