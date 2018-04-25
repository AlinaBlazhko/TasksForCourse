package salad.Employees;

import salad.Portion;
import salad.enums.Type;
import salad.exceptions.MenuException;
import salad.vegetables.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server implements Employee{

    String name = "Alex";
    String job = "Server";

    public List<Portion> order() {
        List<Portion> portionList = new ArrayList<Portion>();
        Scanner in = new Scanner(System.in);
        System.out.print("1. Potato\n" +
                "2. Tomato\n" +
                "3. Cucmber\n" +
                "4. Leaf salad\n" +
                "5. Onion\n" +
                "6. Olive\n");

        String answer = "yes";
        Vegetable product = null;
        while (!(in.nextLine().equals("no"))) {
            System.out.print("Choose number: ");
            int number = in.nextInt();
            if ((number < 1) || (number >= Type.values().length))  try {
                throw new MenuException("Please, choose another product", number);
            } catch (MenuException e) {
                e.printStackTrace();
            }
            System.out.print("How many portions? ");
            int count = in.nextInt();
            if (number < 1)  try {
                throw new MenuException("Please, choose another count of portions", number);
            } catch (MenuException e) {
                e.printStackTrace();
            }

            switch (number) {
                case 1:
                    product = new Potato();
                    portionList.add(new Portion(product, count));
                    break;
                case 2:
                    product = new Tomato();
                    portionList.add(new Portion(product, count));
                    break;
                case 3:
                    product = new Cucumber();
                    portionList.add(new Portion(product, count));
                    break;
                case 4:
                    product = new LeafSalad();
                    portionList.add(new Portion(product, count));
                    break;
            }
            System.out.println("Anything else? ");
            in.nextLine();
//            if ((!(answer.equals("yes")))||(!(answer.equals("no")))) throw new UnsupportedOperationException("Please enter 'yes' or 'not'");
        }
        return portionList;
    }

    public void getAllOrderWithSortVegetablesByCalories(List<Portion> portions){
        System.out.println("Your order: ");
        int total = 0;
        for (Portion portion: portions){
            System.out.println(portion.getProduct().getName() + " : " + portion.sumCal() + "cal");
            total = total + portion.sumCal();
        }
        System.out.println("TOTAL: " + total + " kcal");
    }

    public void presentation() {
        System.out.println("Good evening! My name is " + name + " I am your " + job + " for today");
    }
}
