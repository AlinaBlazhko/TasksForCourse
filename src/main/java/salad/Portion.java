package salad;

import salad.vegetables.Vegetable;

/**
 * Created by X240 on 4/21/2018.
 */
public class Portion {
    //amount of min portion for product
    private Vegetable product;
    private int count;

    public Portion(Vegetable product, int count) {
        this.product = product;
        this.count = count;
    }


    public Vegetable getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }

    public void setProduct(Vegetable product) {
        this.product = product;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int sumCal(){
        return (int) (product.getCalForOnePortion()*count);
    }

}
