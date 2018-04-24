package salad;

import java.util.*;
import salad.vegetables.*;


/**
 * Created by X240 on 4/21/2018.
 */

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        List<Portion> portionList = new ArrayList<Portion>();
        portionList = server.takeOrder();
        server.getAllOrderWithSortVegetablesByCalories(portionList);
    }
}
