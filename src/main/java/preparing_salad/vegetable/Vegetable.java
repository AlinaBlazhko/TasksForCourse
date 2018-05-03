package preparing_salad.vegetable;

/**
 * Created by X240 on 5/2/2018.
 */
public abstract class Vegetable {
    private String name;
    private int cal;
    private String category;

    protected Vegetable(String vegetable, int cal) {
        this.name = vegetable;
        this.cal = cal;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return cal;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return getName() + " " + getCalories() + " kcal";
    }
}
