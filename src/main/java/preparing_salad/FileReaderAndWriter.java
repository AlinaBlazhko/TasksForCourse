package preparing_salad;


import preparing_salad.vegetable.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by X240 on 5/2/2018.
 */
public class FileReaderAndWriter {

    public static void main(String[] args) {
        List<String> order = textReader("src\\main\\resources\\order.txt");
        List<Ingridient> ingridients = new ArrayList();

        for (int i = 0; i < order.size(); i++){
            String[] ingridient = order.get(i).split("-");
            switch (ingridient[0]){
                case "carrot": ingridients.add(new Ingridient(new Carrot(), Integer.parseInt(ingridient[1])));
                    break;
                case "cucumber": ingridients.add(new Ingridient(new Cucumber(), Integer.parseInt(ingridient[1])));
                    break;
                case "onion": ingridients.add(new Ingridient(new Onion(), Integer.parseInt(ingridient[1])));
                    break;
                case "potato": ingridients.add(new Ingridient(new Potato(), Integer.parseInt(ingridient[1])));
                    break;
                case "pumpkin": ingridients.add(new Ingridient(new Pumpkin(), Integer.parseInt(ingridient[1])));
                    break;
            }
//            ingridients.add(new Ingridient(ingridient[0], Integer.parseInt(ingridient[1])));
        }

    }

    public static List<String> textReader(String filePath) {
        BufferedReader bufReader = null;
        try {
            bufReader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> listOfLines = new ArrayList();
        String line = null;
        try {
            line = bufReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (line != null) {
            listOfLines.add(line);
            try {
                line = bufReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        for(int i = 0; i < listOfLines.size(); i++){
//            System.out.println(listOfLines.get(i));
//        }
        return listOfLines;
    }

    public List<Ingridient> split(){
        List<String> order = textReader("src\\main\\resources\\order.txt");
        List<Ingridient> ingridients = new ArrayList<Ingridient>();

        for (int i = 0; i < order.size(); i++){
            String[] ingridient = order.get(i).split("-");
            switch (ingridient[0]){
                case "carrot": ingridients.add(new Ingridient(new Carrot(), Integer.parseInt(ingridient[1])));
                    break;
                case "cucumber": ingridients.add(new Ingridient(new Cucumber(), Integer.parseInt(ingridient[1])));
                    break;
                case "onion": ingridients.add(new Ingridient(new Onion(), Integer.parseInt(ingridient[1])));
                    break;
                case "potato": ingridients.add(new Ingridient(new Potato(), Integer.parseInt(ingridient[1])));
                    break;
                case "pumpkin": ingridients.add(new Ingridient(new Pumpkin(), Integer.parseInt(ingridient[1])));
                    break;
            }
//            ingridients.add(new Ingridient(ingridient[0], Integer.parseInt(ingridient[1])));
        }
        return ingridients;
    }
}
