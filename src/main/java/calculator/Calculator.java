package calculator;
import java.util.Scanner;


/**
 * Created by X240 on 4/17/2018.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter operation: ");
        String oper = in.next();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        Calculator calc = new Calculator();
        int res = calc.calculation(a, b, oper);
        System.out.print(a + " " + oper + " " + b + " = " + res);

    }

    public int calculation(int a, int b, String oper){
        int result = 0;
        if (oper.equals("+")){
            result = a + b;
        }
        if (oper.equals("-")){
            result = a - b;
        }
        if (oper.equals("*")){
            result = a * b;
        }
        if (oper.equals("/")){
            result = a / b;
        }
        return result;
    }
}
