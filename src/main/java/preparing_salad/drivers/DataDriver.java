package preparing_salad.drivers;

import preparing_salad.Ingridient;

import java.util.*;
/**
 * Created by X240 on 5/2/2018.
 */
public class DataDriver {
    JsonReader jsonReader = new JsonReader();
    FileReaderAndWriter fileReaderAndWriter = new FileReaderAndWriter();
    DBReader dbReader = new DBReader();
    ConsoleReader consoleReader = new ConsoleReader();

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
        List<Ingridient> ingridients = new ArrayList<Ingridient>();
        switch (type){
            case "1": ingridients = consoleReader.read();
                    break;
            case "2": ingridients = jsonReader.read();
                    break;
            case "3": ingridients = fileReaderAndWriter.read();
                    break;
            case "4": ingridients = dbReader.read();
                    break;
        }
        return ingridients;
    }
}