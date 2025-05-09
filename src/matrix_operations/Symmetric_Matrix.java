package matrix_operations;

import java.util.Arrays;

public class Symmetric_Matrix {
    public static void main(String[] args) {
        int ip1[][] = { { 2, 3, 6 },
                { 3, 4, 5 },
                { 6, 5, 9 } };

        int ip2[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        if (isMatrixSymmetric(ip1)) {
            System.out.println(Arrays.toString(ip1) + "Symmetric!");
        } else {
            System.out.println(Arrays.toString(ip1) + "Not symmetric.");
        }

        if (isMatrixSymmetric(ip2)) {
            System.out.println(Arrays.toString(ip2) + "Symmetric!");
        } else {
            System.out.println(Arrays.toString(ip2) + "Not symmetric.");
        }
    }

    private static boolean isMatrixSymmetric(int[][] matrix) {
        int rows = matrix.length;
        if (rows == 0) {
            return true;
        }
        int cols = matrix[0].length;
        if (rows != cols) {
            return false;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}