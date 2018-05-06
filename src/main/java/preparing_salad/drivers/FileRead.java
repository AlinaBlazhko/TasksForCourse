package preparing_salad.drivers;


import preparing_salad.Ingridient;
import preparing_salad.vegetable.*;

import java.io.*;
import java.util.*;

/**
 * Created by X240 on 5/2/2018.
 */
public class FileRead implements Reader{

    public static List<String> textReader(String filePath) {
        BufferedReader bufReader = null;
        try {
            bufReader = new BufferedReader(new java.io.FileReader(filePath));
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

        return listOfLines;
    }

    @Override
    public List<Ingridient> read() {
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
        }

        System.out.println("Your order (in order of increasing caloric content): ");
        Collections.sort(ingridients);

        for(Ingridient str: ingridients){
            System.out.println(str);
        }
        return ingridients;
    }

    public void writer(String filepath){
        FileOutputStream file = null;
        try {
            file = new FileOutputStream(filepath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        FileWriter tee = new FileWriter(file, System.out);
        System.setOut(tee);
    }

}
