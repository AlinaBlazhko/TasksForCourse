package salad.vegetables;

import salad.enums.Type;

import static salad.enums.Type.TOMATO;


/**
 * Created by X240 on 4/21/2018.
 */

public class Tomato extends Product{

    private Type vegetable = TOMATO;
    private int cal = 20;
    private int onePortion = 30;
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
    public Tomato() {
        super();
    }

    @Override
    public double getCalForOnePortion() {
        return super.getCalForOnePortion();
    }
}
