package salad.vegetables;

import lombok.Getter;
import lombok.Setter;
import salad.enums.Type;

/**
 * Created by X240 on 4/21/2018.
 */

public abstract class Product {
    private Type vegetable = null;
    private int cal = 0;
    private int onePortion = 0;

    protected Product() {
    }

    public Type getVegetable() {
        return vegetable;
    }

    public int getCal() {
        return cal;
    }

    public int getOnePortion() {
        return onePortion;
    }
}
