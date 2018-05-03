package preparing_salad.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.*;
/**
 * Created by X240 on 5/2/2018.
 */
public class OrderJson {
    @SerializedName("vegetables")
    @Expose
    private List<VegetableJson> vegetables = null;

    public List<VegetableJson> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<VegetableJson> vegetables) {
        this.vegetables = vegetables;
    }
}
