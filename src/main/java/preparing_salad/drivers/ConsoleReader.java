package preparing_salad.drivers;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import preparing_salad.Ingridient;
import preparing_salad.exceptions.IllegalWeightOfIngridientException;
import preparing_salad.vegetable.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 * Created by X240 on 5/3/2018.
 */
public class ConsoleReader implements Reader{

    @Override
    public List<Ingridient> read() {
        List<Ingridient> ingridients = new ArrayList<Ingridient>();
        Scanner in = new Scanner(System.in);

        System.out.print("Please choose ingredients \n" +
                "1. Carrot\n" +
                "2. Cucumber\n" +
                "3. Onion\n" +
                "4. Potato\n" +
                "5. Pumpkin");

        String answer = "yes";
        Vegetable product = null;
        while (!(in.nextLine().equals("no"))) {
            System.out.println("Push Enter");
            System.out.print("Choose number: ");
            int number = in.nextInt();

            System.out.print("How many grams? ");

            int weight = in.nextInt();
            if (number < 1)  try {
                throw new IllegalWeightOfIngridientException(number);
            } catch (IllegalWeightOfIngridientException e) {
                e.printStackTrace();
            }

            switch (number) {
                case 1:
                    ingridients.add(new Ingridient(new Carrot(), weight));
                    break;
                case 2:
                    ingridients.add(new Ingridient(new Cucumber(), weight));
                    break;
                case 3:
                    ingridients.add(new Ingridient(new Onion(), weight));
                    break;
                case 4:
                    ingridients.add(new Ingridient(new Potato(), weight));
                    break;
                case 5:
                    ingridients.add(new Ingridient(new Pumpkin(), weight));
                    break;
            }
            System.out.println("Anything else? (type  \"no\" or \"yes\") ");
            in.nextLine();
        }

        System.out.println("Your order: ");
        Collections.sort(ingridients);

        for(Ingridient str: ingridients){
            System.out.println(str);
        }
        return ingridients;
    }
}
