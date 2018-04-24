package salad.exceptions;

/**
 * Created by X240 on 4/22/2018.
 */
public class MenuException extends Exception{
    private int number;

    public int getNumber() {
        return number;
    }

    public MenuException(String message, int num){
        super(message);
        number = num;
    }
}
