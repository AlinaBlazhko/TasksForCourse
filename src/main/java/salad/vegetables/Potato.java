package salad.vegetables;

import salad.enums.Type;

import static salad.enums.Type.POTATO;

/**
 * Created by X240 on 4/21/2018.
 */

public class Potato extends Product{

    private Type vegetable = POTATO;
    private int cal = 109;
    private int onePortion = 60;

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

    public Potato() {
        super();
    }
}
