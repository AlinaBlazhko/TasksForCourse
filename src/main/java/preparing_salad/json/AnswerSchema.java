package preparing_salad.json;

import preparing_salad.Ingridient;
import java.util.*;

/**
 * Created by X240 on 5/2/2018.
 */
public class AnswerSchema {
    private String name;
    private List<Ingridient> ingridientList;
    private String total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingridient> getIngridientList() {
        return ingridientList;
    }

    public void setIngridientList(List<Ingridient> ingridientList) {
        this.ingridientList = ingridientList;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
