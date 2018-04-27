package salad.vegetables;

import salad.enums.Type;

public class CruciferaeVegetables extends Vegetable{
    protected CruciferaeVegetables(String vegetable, int cal, int onePortion) {
        super(vegetable, cal, onePortion);
        setCategory("Cruciferae vegetables");
    }
}
