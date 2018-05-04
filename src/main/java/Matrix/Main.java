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

        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mB.length; j++) {
                for (int k = 0; k < mB.length; k++) {
                    res[i][j] += mA[i][k] * mB[k][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }
    }
}
