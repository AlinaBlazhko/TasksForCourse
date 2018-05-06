package preparing_salad.drivers;

import com.google.gson.Gson;
import preparing_salad.Ingridient;
import preparing_salad.json.OrderJson;
import preparing_salad.vegetable.*;
import preparing_salad.exceptions.IllegalWeightOfIngridientException;


import java.io.*;
import java.util.*;
import java.util.List;

/**
 * Created by X240 on 5/2/2018.
 */
public class JsonReader implements Reader{
    Gson gson = new Gson();

    @Override
    public List<Ingridient> read() {
        List<Ingridient> ingridients = new ArrayList<Ingridient>();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("src\\main\\resources\\order.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        OrderJson json = gson.fromJson(bufferedReader, OrderJson.class);

        for (int i = 0; i < json.getVegetables().size(); i++){
            if (json.getVegetables().get(i).getWeight() < 30)  try {
                throw new IllegalWeightOfIngridientException(json.getVegetables().get(i).getWeight());
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
        }

        System.out.println("Your order (in order of increasing caloric content): ");
        Collections.sort(ingridients);

        for(Ingridient str: ingridients){
            System.out.println(str);
        }
        return ingridients;
    }
}
