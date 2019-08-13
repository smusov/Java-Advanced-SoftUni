import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> phoneNumbers = new HashMap<>();

        String input;

        while(!"search".equals(input=read.readLine())){

            String[] data = input.split("-");

            phoneNumbers.put(data[0],data[1]);

        }

        while (!"stop".equals(input=read.readLine())){

            if (phoneNumbers.containsKey(input)){
                System.out.println(String.format("%s -> %s",input,phoneNumbers.get(input)));
            }else {
                System.out.println(String.format("Contact %s does not exist.",input));
            }

        }
    }
}
