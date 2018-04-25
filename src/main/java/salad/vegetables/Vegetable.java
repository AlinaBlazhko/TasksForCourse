package salad.vegetables;

import salad.enums.Type;

/**
 * Created by X240 on 4/21/2018.
 */

public abstract class Vegetable {
    private Type name = null;
    private int cal = 0;
    private int onePortion = 0;

    protected Vegetable(Type vegetable, int cal, int onePortion) {
        this.name = vegetable;
        this.cal = cal;
        this.onePortion = onePortion;
    }

    public Type getName() {
        return name;
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
