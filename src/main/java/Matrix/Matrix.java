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

    public void fill() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Enter a[" + i + "][" + j + "]");
                a[i][j] = in.nextInt();
            }
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

//    public Matrix multiply(Matrix multiplier) {
//        int resultRows = a.length;
//        int resultColumns = multiplier[0].length;
//        Matrix result = new Matrix(resultRows, resultColumns);
//
//        for(int myRow = 0; myRow < a.length; ++myRow) {
//            for(int otherCol = 0; otherCol< multiplier[0].length; ++otherCol) {
//                int value = 0;
//                for(int myCol = 0; myCol < a[myRow].length; ++myCol) {
//                    for(int otherRow = 0; otherRow < multiplier.length; ++otherRow) {
//                        value += a[myRow][myCol] * multiplier[otherRow][otherCol];
//                    }
//                }
//                result[myRow][otherCol] = value;
//            }
//        }
//        return result;
//    }
}