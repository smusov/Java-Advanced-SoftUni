import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class AMinerTask {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Long> resources = new LinkedHashMap<>();

        String input;

        int count = 0;

        String key = "";

        while(!"stop".equals(input=read.readLine())){
        
            if (count++%2==0){

                if (!resources.containsKey(input)){
                    resources.put(input,0L);
                }

                key=input;
            }else {
               resources.put(key,resources.get(key)+Integer.parseInt(input));
            }
            
        }

        resources.forEach((element,value)-> System.out.println(String.format("%s -> %d",element,value)));

    }
}
