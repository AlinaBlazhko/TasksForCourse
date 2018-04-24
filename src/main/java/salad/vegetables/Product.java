package salad.vegetables;

import salad.enums.Type;

/**
 * Created by X240 on 4/21/2018.
 */

public abstract class Product {
    private Type vegetable = null;
    private int cal = 0;
    private int onePortion = 0;

    protected Product(Type vegetable, int cal, int onePortion) {
        this.vegetable = vegetable;
        this.cal = cal;
        this.onePortion = onePortion;
    }

    public Type getVegetable() {
        return vegetable;
    }

    public int getCalories() {
        return cal;
    }

    public int getOnePortion() {
        return onePortion;
    }

    public double getCalForOnePortion(){
        double calForOneGr = getCalories()/100;
        return calForOneGr*getOnePortion();
    }
}
