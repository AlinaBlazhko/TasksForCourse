package Matrix;

import java.util.*;

/**
 * Created by X240 on 4/23/2018.
 */
public class Matrix {

    private final int[][] a;

    public Matrix(int n, int m) {
        a = new int[n][m];
    }

    public int[][] fill() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Enter a[" + i + "][" + j + "]");
                a[i][j] = in.nextInt();
            }
        return a;
    }

    public void print() {
        System.out.println("Maтрица : " + a.length + "  " + a[0].length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}