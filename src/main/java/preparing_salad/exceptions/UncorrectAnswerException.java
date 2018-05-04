package preparing_salad.exceptions;

/**
 * Created by X240 on 4/22/2018.
 */
public class UncorrectAnswerException extends Exception{
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public UncorrectAnswerException(String num){
        super("Please, write \"yes\" or \"no\"");
        answer = num;
    }
}
