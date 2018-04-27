package salad;

import javax.sound.sampled.Port;
import java.util.*;

/**
 * Created by X240 on 4/21/2018.
 */
public class Salad{
    List<Portion> portions = new ArrayList<Portion>();

    Salad(){};
    double total = 0;

    public void getAllIngredient(List<Portion> ingredient){
        for (Portion portion: ingredient){
            System.out.println(portion.getProduct().getName() + " : " + portion.sumCal());

        }
    }

    public double getTotalCalories(List<Portion> ingredient){
        for (Portion portion: ingredient){
            total += portion.sumCal();
        }
        return total;
    }
}
