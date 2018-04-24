package salad.vegetables;

import salad.enums.*;

import static salad.enums.Type.CUCUMBER;

/**
 * Created by X240 on 4/21/2018.
 */

public class Cucumber extends Product{
    private Type vegetable  = CUCUMBER;
    private int cal = 109;
    private int onePortion = 30;

    public Cucumber(){super();}

    @Override
    public Type getVegetable() {
        return vegetable;
    }

    @Override
    public int getCal() {
        return cal;
    }

    @Override
    public int getOnePortion() {
        return onePortion;
    }
}
