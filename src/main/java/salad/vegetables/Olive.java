package salad.vegetables;

import salad.enums.Type;

import static salad.enums.Type.CUCUMBER;
import static salad.enums.Type.OLIVES;

/**
 * Created by X240 on 4/21/2018.
 */

public class Olive extends Product{
    private Type vegetable  = OLIVES;
    private int cal = 164;
    private int onePortion = 20;

    public Olive(){super();}

    @Override
    public Type getVegetable() {
        return vegetable;
    }

    @Override
    public int getCalories() {
        return cal;
    }

    @Override
    public int getOnePortion() {
        return onePortion;
    }

    @Override
    public double getCalForOnePortion() {
        return super.getCalForOnePortion();
    }
}
