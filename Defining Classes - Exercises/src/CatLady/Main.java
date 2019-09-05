package CatLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));

        List<Cat> cats = new ArrayList<>();

        String input;

        while(!"End".equals(input=read.readLine())){

            String [] data = input.split("\\s+");

            Cat cat = null;

            switch (data[0]){
                case "StreetExtraordinaire":
                    cat = new StreetExtraordinaire(data[1],Double.parseDouble(data[2]));
                    break;
                case "Siamese":
                    cat = new Siamese(data[1],Double.parseDouble(data[2]));
                    break;
                case "Cymric":
                    cat = new Cymric(data[1],Double.parseDouble(data[2]));
                    break;
            }
            cats.add(cat);
        }

        String catName = read.readLine();

        cats.stream().filter(cat->cat.getName().equals(catName)).forEach(System.out::println);
    }
}
