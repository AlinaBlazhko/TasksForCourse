package salad.enums;


/**
 * Created by X240 on 4/21/2018.
 */

public enum Type {

    TOMATO("tomato"),
    CUCUMBER("cucumber"),
    ONION("onion"),
    POTATO("potato"),
    LEAF_SALAD("leaf salad"),
    OLIVES("olives");

    private String name;

    public String getName() {
        return name;
    }


    Type(String name){
        this.name = name;
    }
}
