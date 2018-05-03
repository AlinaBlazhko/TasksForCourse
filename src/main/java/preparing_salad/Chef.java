package preparing_salad;

import preparing_salad.drivers.DataDriver;
import salad.exceptions.IllegalNumberException;

import java.util.Scanner;
import java.util.*;

/**
 * Created by X240 on 5/3/2018.
 */
public class Chef {

    private String name;
    private String typeOfInput;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfInput() {
        return typeOfInput;
    }

    public void setTypeOfInput(String typeOfInput) {
        this.typeOfInput = typeOfInput;
    }

    Chef (String name){
        this.name = name;
    }

    public Chef(String name, String typeOfInput) {
        this.name = name;
        this.typeOfInput = typeOfInput;
    }


    public void takeOrder(){
        Scanner in = new Scanner(System.in);
        System.out.println("Hello my name is " + getName());
        System.out.println("Please, choose one of the way ordering and type number:\n" +
                "    1. consol\n" +
                "    2. json\n" +
                "    3. file\n" +
                "    4. data base");
        int number = in.nextInt();
        if ((number < 1)||(number > 4))try {
            throw new IllegalNumberException("Please, choose another number", number);
        } catch (IllegalNumberException e) {
            e.printStackTrace();
        }
        DataDriver dataDriver = new DataDriver(String.valueOf(number));
        List<Ingridient> ingridientList =  dataDriver.readInput();

        System.out.println("Total calories: " + getTotalCalories(ingridientList));
        /*for (Ingridient ingridient: ingridientList){
            System.out.println(ingridient.toString());
        }*/
    }

    public double getTotalCalories(List<Ingridient> ingridients){
         double result = 0;
        for (Ingridient in: ingridients) {
            result += in.getWeight()*in.getName().getCalories()/100;
        }
        return result;
    }
}
