package preparing_salad.drivers;

import preparing_salad.Ingridient;
import preparing_salad.vegetable.Cucumber;
import preparing_salad.vegetable.Vegetable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by X240 on 5/3/2018.
 */
public class ConsoleReader {

    public List<Ingridient> order() {
        List<Ingridient> portionList = new ArrayList<Ingridient>();
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
            System.out.print("Choose number: ");
            int number = in.nextInt();

            System.out.print("How many portions? ");
//            int count = in.nextInt();
//            if (number < 1)  try {
//                throw new IllegalWeightOfIngridientException("Please, choose another count of portions", number);
//            } catch (IllegalWeightOfIngridientException e) {
//                e.printStackTrace();
//            }

//            switch (number) {
//                case 1:
//                    product = new Cucumber();
//                    portionList.add(new Ingridient(product.getName(), count));
//                    break;
//                case 2:
//                    product = new Pumpkin();
//                    portionList.add(new Portion(product, count));
//                    break;
//                case 3:
//                    product = new Cucumber();
//                    portionList.add(new Portion(product, count));
//                    break;
//                case 4:
//                    product = new Onion();
//                    portionList.add(new Portion(product, count));
//                    break;
//            }
            System.out.println("Anything else? ");
            in.nextLine();
        }
        return portionList;
    }

}
