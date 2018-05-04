package preparing_salad;

import preparing_salad.vegetable.Vegetable;

import java.util.*;

/**
 * Created by X240 on 5/2/2018.
 */
public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Ivan");
        System.out.println("If you want to order by json, you need to open src\\main\\resources\\order.json and write " +
                "ingredient which you want to put in your salad");
        System.out.println("If you want to order by json, you need to open src\\main\\resources\\order.txt and write " +
                "ingredient which you want to put in your salad after working our program open " +
                "src\\main\\resources\\answer.txt file for getting output");
        chef.takeOrder();
    }
}
