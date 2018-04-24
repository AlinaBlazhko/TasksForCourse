package salad.exceptions;

/**
 * Created by X240 on 4/22/2018.
 */
public class UncorrectAnswerException extends Exception{
    private String answer;

    public String getAnswer() {
        return answer;
    }

    UncorrectAnswerException(String message, String num){
        super(message);
        answer = num;
    }
}
