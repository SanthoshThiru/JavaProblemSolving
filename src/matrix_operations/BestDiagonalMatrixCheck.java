package matrix_operations;

public class BestDiagonalMatrixCheck {
    public static void main(String[] args) {
        int ip1[][] = { { 3, 0, 0, 0, 0 },
                        { 0, 3, 0, 0, 0 },
                        { 0, 0, 1, 0, 0 },
                        { 0, 0, 0, 4, 0 },
                        { 0, 0, 0, 0, 0 } };

        int ip2[][] = { { 1, 0, 2 },
                        { 0, 5, 0 },
                        { 0, 0, 9 } };

        int ip3[][] = { { 1, 0, 0 },
                        { 0, 0, 0 },
                        { 0, 0, 3 } };

        int ip4[][] = { { 1, 2, 0 },
                        { 0, 5, 0 },
                        { 0, 0, 9 } };

        if (DiagonalCheck(ip1)) {
            System.out.println("ip1 is A DIAGONAL MATRIX");
        } else {
            System.out.println("ip1 is NOT A DIAGONAL MATRIX");
        }

        if (DiagonalCheck(ip2)) {
            System.out.println("ip2 is A DIAGONAL MATRIX");
        } else {
            System.out.println("ip2 is NOT A DIAGONAL MATRIX");
        }

        if (DiagonalCheck(ip3)) {
            System.out.println("ip3 is A DIAGONAL MATRIX");
        } else {
            System.out.println("ip3 is NOT A DIAGONAL MATRIX");
        }

        if (DiagonalCheck(ip4)) {
            System.out.println("ip4 is A DIAGONAL MATRIX");
        } else {
            System.out.println("ip4 is NOT A DIAGONAL MATRIX");
        }
    }

    private static boolean DiagonalCheck(int[][] ip) {
        int n = ip.length;
        if (n != ip[0].length) {
            return false; // Not a square matrix, cannot be diagonal
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && ip[i][j] != 0) {
                    return false; // Found a non-zero element off the main diagonal
                }
            }
        }
        return true; // All off-diagonal elements are zero
    }
}