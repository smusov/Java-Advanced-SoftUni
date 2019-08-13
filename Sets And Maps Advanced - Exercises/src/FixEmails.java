import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class FixEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> emails = new LinkedHashMap<>();

        String input;

        while(!"stop".equals(input=read.readLine())){

            String email = read.readLine();

            if (!email.endsWith(".com")&&!email.endsWith(".us")&&!email.endsWith(".uk")){
                emails.put(input,email);
            }

        }

        emails.forEach((name,email)-> System.out.println(String.format("%s -> %s",name,email)));
    }
}
