package Matrix;

/**
 * Created by X240 on 4/23/2018.
 */
public class Main {
    public static void main(String[] args) {
        int[][] mA ={{1, 2, 3},
                {6, 5, 4},
                {7, 8, 9}};
        int[][] mB ={{1, 2, 3},
                {6, 5, 4},
                {7, 8, 9}};

        int m = mA.length;
        int n = mB[0].length;
        int o = mB.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mB.length; j++) {
                for (int k = 0; k < o; k++) {
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
