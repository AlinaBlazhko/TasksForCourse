package preparing_salad.exceptions;

/**
 * Created by X240 on 4/22/2018.
 */
public class IllegalWeightOfIngridientException extends Exception{
    private int number;

    public int getNumber() {
        return number;
    }

    public IllegalWeightOfIngridientException(int num){
        super("Please, choose another weight");
        number = num;
    }
}
