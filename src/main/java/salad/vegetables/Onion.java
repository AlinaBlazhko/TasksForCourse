package salad.vegetables;

import salad.enums.Type;

import static salad.enums.Type.CUCUMBER;
import static salad.enums.Type.ONION;

/**
 * Created by X240 on 4/21/2018.
 */

public class Onion extends Product{
    private Type vegetable  = ONION;
    private int cal = 40;
    private int onePortion = 10;

    public Onion(){super();}

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
