import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Robotics {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

       String[] data =  read.readLine().split(";");

       String[] robotsName = new String[data.length];
       int[] processTime = new int[data.length];
       int[] robotsTimes = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            String[] splitData = data[i].split("-");
            robotsName[i]=splitData[0];
            processTime[i]=Integer.parseInt(splitData[1]);
        }

        String startTime = read.readLine();

        ArrayDeque <String> products = new ArrayDeque<>();

        String input;
        
        while(!"End".equals(input=read.readLine())){
            products.offer(input);
        }

        int[] times = Arrays.stream(startTime.split(":")).mapToInt(Integer::parseInt).toArray();

        LocalTime time = LocalTime.of(times[0],times[1],times[2]);

        while (!products.isEmpty()){

            time=time.plusSeconds(1);

            boolean freeRobot = true;
            String product = products.poll();

            for (int i = 0; i < robotsTimes.length; i++) {

                if (robotsTimes[i]==0&&freeRobot){
                    robotsTimes[i]=processTime[i];
                    freeRobot=false;
                    System.out.println(String.format("%s - %s [%02d:%02d:%02d]",robotsName[i],product,time.getHour(),time.getMinute(),time.getSecond()));
                }

                if (robotsTimes[i]>0){
                    robotsTimes[i]--;
                }
            }

            if (freeRobot){
                products.offer(product);
            }

        }

    }
}
