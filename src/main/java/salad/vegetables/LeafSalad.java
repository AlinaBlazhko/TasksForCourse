package salad.vegetables;

import salad.enums.Type;

import static salad.enums.Type.LEAF_SALAD;

/**
 * Created by X240 on 4/21/2018.
 */

public class LeafSalad extends Product{
    private Type vegetable = LEAF_SALAD;
    private int cal = 19;
    private int onePortion = 30;

    public LeafSalad(){super();}

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
