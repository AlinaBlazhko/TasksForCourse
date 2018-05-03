package salad.vegetables;

import salad.enums.Type;

public class RootVegetable extends Vegetable{

    protected RootVegetable(String vegetable, int cal, int onePortion) {
        super(vegetable, cal, onePortion);
        setCategory("Root VegetableJson");
    }
}
