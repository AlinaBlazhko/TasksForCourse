package Matrix;

import java.util.*;

/**
 * Created by X240 on 4/23/2018.
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter n");
        int n = in.nextInt();

        System.out.println("Please enter m");
        int m = in.nextInt();

        Matrix matrix = new Matrix(n, m);
        int[][] mA = matrix.fill();
        matrix.print();

        int[][] mB = matrix.fill();
        matrix.print();


        int[][] res = new int[n][m];

        matrix.multipleTwoMatrix(mA, mB, res);
    }
}
