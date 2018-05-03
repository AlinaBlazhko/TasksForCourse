package preparing_salad;

import preparing_salad.vegetable.Vegetable;

/**
 * Created by X240 on 5/3/2018.
 */
public class WeightComparator implements java.util.Comparator<Vegetable>{
    public int compare(Vegetable v1, Vegetable v2) {
        return (int) (v1.getCalories() - v2.getCalories());
    }
}