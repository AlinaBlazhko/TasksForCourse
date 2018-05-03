package preparing_salad.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by X240 on 5/2/2018.
 */
public class VegetableJson {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("weight")
    @Expose
    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
