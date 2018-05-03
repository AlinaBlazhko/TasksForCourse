package preparing_salad;

import java.util.*;
import preparing_salad.vegetable.Vegetable;

/**
 * Created by X240 on 5/2/2018.
 */
public class Salad {
    private String name;
    private List<Ingridient> ingredients = new ArrayList();

    Salad(String name, List<Ingridient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingridient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingridient> ingredients) {
        this.ingredients = ingredients;
    }

    public double sumCalories(){
        double result = 0;
        for (int i = 0; i < ingredients.size(); i++){
            result = ingredients.get(i).getWeight() + result;
        }
        return result;
    }

}
