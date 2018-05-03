package salad.Employees;

import salad.Portion;
import salad.enums.Type;
import salad.exceptions.IllegalWeightOfIngridientException;
import salad.exceptions.IllegalNumberException;
import salad.vegetables.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server implements Employee{

    String name = "Alex";
    String job = "Server";

    public void getAllOrderWithSortVegetablesByCalories(List<Portion> portions){
        System.out.println("Your order: ");
        int total = 0;
        for (Portion portion: portions){
            System.out.println(portion.getProduct().getName() + " : " + portion.sumCal() + "cal");
            total = total + portion.sumCal();
        }
        System.out.println("TOTAL: " + total + " kcal");
    }

    public List<Portion> order() {
        List<Portion> portionList = new ArrayList<Portion>();
        Scanner in = new Scanner(System.in);

        System.out.print("1. Potato\n" +
                "2. Pumpkin\n" +
                "3. Cucumber\n" +
                "4. Onion");

        String answer = "yes";
        Vegetable product = null;
        while (!(in.nextLine().equals("no"))) {
            System.out.print("Choose number: ");
            int number = in.nextInt();
            if ((number < 1) || (number >= Type.values().length))  try {
                throw new IllegalNumberException("Please, choose another product", number);
            } catch (IllegalNumberException e) {
                e.printStackTrace();
            }
            System.out.print("How many portions? ");
            int count = in.nextInt();
            if (number < 1)  try {
                throw new IllegalWeightOfIngridientException("Please, choose another count of portions", number);
            } catch (IllegalWeightOfIngridientException e) {
                e.printStackTrace();
            }

            switch (number) {
                case 1:
                    product = new Potato();
                    portionList.add(new Portion(product, count));
                    break;
                case 2:
                    product = new Pumpkin();
                    portionList.add(new Portion(product, count));
                    break;
                case 3:
                    product = new Cucumber();
                    portionList.add(new Portion(product, count));
                    break;
                case 4:
                    product = new Onion();
                    portionList.add(new Portion(product, count));
                    break;
            }
            System.out.println("Anything else? ");
            in.nextLine();
        }
        return portionList;
    }

    public void presentation() {
        System.out.println("Good evening! My name is " + name + " I am your " + job + " for today");
    }
}
