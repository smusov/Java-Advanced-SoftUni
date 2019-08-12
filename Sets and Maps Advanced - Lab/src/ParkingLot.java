import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Set<String>numbers = new HashSet<>();

        String input;

        while(!"END".equals(input=read.readLine())){

            String[] data = input.split(", ");

            switch (data[0]){
                case "IN":
                    numbers.add(data[1]);
                    break;
                case "OUT":
                    numbers.remove(data[1]);
                    break;
            }

        }
        if (numbers.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            System.out.println(String.join("\n", numbers));
        }
    }
}
