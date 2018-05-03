package salad.exceptions;

/**
 * Created by X240 on 4/22/2018.
 */
public class IllegalNumberException extends Exception{
    private int number;

    public int getNumber() {
        return number;
    }

    public IllegalNumberException(String message, int num){
        super(message);
        number = num;
    }
}
