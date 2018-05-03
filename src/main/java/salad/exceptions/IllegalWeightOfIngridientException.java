package salad.exceptions;

/**
 * Created by X240 on 4/22/2018.
 */
public class IllegalWeightOfIngridientException extends Exception{
    private int number;

    public int getNumber() {
        return number;
    }

    public IllegalWeightOfIngridientException(String message, int num){
        super(message);
        number = num;
    }
}
