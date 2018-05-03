package preparing_salad;

import com.google.gson.Gson;
import preparing_salad.json.AnswerSchema;
import preparing_salad.json.OrderJson;
import preparing_salad.vegetable.*;
import salad.exceptions.IllegalWeightOfIngridientException;


import java.io.*;
import java.util.*;
import java.util.List;

/**
 * Created by X240 on 5/2/2018.
 */
public class JsonReader {
    Gson gson = new Gson();

    public List<Ingridient> readJson(String filePath){
        List<Ingridient> ingridients = new ArrayList<Ingridient>();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        OrderJson json = gson.fromJson(bufferedReader, OrderJson.class);

        for (int i = 0; i < json.getVegetables().size(); i++){
            if (json.getVegetables().get(i).getWeight() < 30)  try {
                throw new IllegalWeightOfIngridientException("It is too small weight. Please, write ", json.getVegetables().get(i).getWeight());
            } catch (IllegalWeightOfIngridientException e) {
               json.getVegetables().remove(json.getVegetables().get(i));
                e.printStackTrace();
            }
        }
        for (int i = 0; i < json.getVegetables().size(); i++){
            switch (json.getVegetables().get(i).getName()){
                case "carrot": ingridients.add(new Ingridient(new Carrot(), json.getVegetables().get(i).getWeight()));
                                break;
                case "cucumber": ingridients.add(new Ingridient(new Cucumber(), json.getVegetables().get(i).getWeight()));
                                break;
                case "onion": ingridients.add(new Ingridient(new Onion(), json.getVegetables().get(i).getWeight()));
                    break;
                case "potato": ingridients.add(new Ingridient(new Potato(), json.getVegetables().get(i).getWeight()));
                    break;
                case "pumpkin": ingridients.add(new Ingridient(new Pumpkin(), json.getVegetables().get(i).getWeight()));
                    break;
            }
//            ingridients.add(new Ingridient(json.getVegetables().get(i).getName(), json.getVegetables().get(i).getWeight()));
        }
        return ingridients;
    }



    public void writeAnswer(String filePath, String name, List<Ingridient> ingridients, String total){
        AnswerSchema answer = new AnswerSchema();
        answer.setName(name);
        answer.setIngridientList(ingridients);
        answer.setTotal(total);
        String json = gson.toJson(answer);

        try {
            //write converted json data to a file named "CountryGSON.json"
            FileWriter writer = new FileWriter(filePath);
            writer.write(json);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
