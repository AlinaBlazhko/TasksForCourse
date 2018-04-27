package salad.vegetables;

import salad.enums.Type;

import java.io.StringReader;

/**
 * Created by X240 on 4/21/2018.
 */

public abstract class Vegetable {
    private String name;
    private int cal;
    private int onePortion;
    private String category;

    protected Vegetable(String category, String vegetable, int cal, int onePortion) {
        this.category = category;
        this.name = vegetable;
        this.cal = cal;
        this.onePortion = onePortion;
    }

    protected Vegetable(String vegetable, int cal, int onePortion) {
        this.name = vegetable;
        this.cal = cal;
        this.onePortion = onePortion;
    }

    public String getName() {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return category + ", " + getName() +",  " + getCalories() + "kcal, " + getOnePortion() + " weight of one portion";
    }
}
