package preparing_salad;

import java.util.*;
/**
 * Created by X240 on 5/2/2018.
 */
public class DataDriver {
    JsonReader jsonReader = new JsonReader();
    FileReaderAndWriter fileReaderAndWriter = new FileReaderAndWriter();
    final static String ORDER_JSON = "src\\main\\resources\\order.json";
    final static String ANSWER_JSON = "src\\main\\resources\\answer.json";
    final static String ORDER_TXT = "src\\main\\resources\\order.txt";
//    final static String ANSWER_ = "\\src\\main\\resources\\answer.json";

    private String type;

    public DataDriver(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Ingridient> readInput(){
        List<Ingridient> ingridients = new ArrayList();
        if (type.equals("2")) {
            ingridients = jsonReader.readJson(ORDER_JSON);

        } else if (type.equals("3")) {
            ingridients = fileReaderAndWriter.split();
        }
        return ingridients;
    }
}