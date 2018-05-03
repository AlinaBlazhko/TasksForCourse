package preparing_salad;

import preparing_salad.vegetable.Vegetable;

/**
 * Created by X240 on 5/2/2018.
 */
public class Ingridient implements Comparable<Ingridient>{
    private Vegetable vegetable;
    private int weight;

    public Ingridient(Vegetable vegetable, int weight) {
        this.vegetable = vegetable;
        this.weight = weight;
    }

    public Vegetable getName() {
        return vegetable;
    }

    public void setName(Vegetable vegetable) {
        this.vegetable = vegetable;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return getName() + " " + getWeight() + "gram";
    }

    @Override
    public int compareTo(Ingridient ingridient) {
        int compareage=((Ingridient)ingridient).getName().getCalories();
        return this.vegetable.getCalories()-compareage;
    }
}
