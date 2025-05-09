package matrix_operations;

public class TriangularMatrix {
    public static void main(String[] args) {
        int ip1[][] = { { 1, 3, 2 },
                        { 0, 5, 7 },
                        { 0, 0, 9 } };

        int ip2[][] = { { 1, 0, 0 },
                        { 3, 6, 0 },
                        { 2, 5, 3 } };
        CheckMatrixType(ip1);
        CheckMatrixType(ip2);

    }

    private static void CheckMatrixType(int[][] ip) {
        int rows = ip.length;
        int cols = ip[0].length;
        if (rows != cols) {
            System.out.println("The matrix is not a triangular matrix");
            return;
        }

        boolean isUpper = true;
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (ip[i][j] != 0) {
                    isUpper = false;
                    break;
                }
            }
            if (!isUpper) {
                break;
            }
        }

        boolean isLower = true;
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                if (ip[i][j] != 0) {
                    isLower = false;
                    break;
                }
            }
            if (!isLower) {
                break;
            }
        }

        if (isUpper && isLower) {
            System.out.println("The matrix is a diagonal matrix (and thus both upper and lower triangular).");
        } else if (isUpper) {
            System.out.println("The matrix is an upper triangular matrix.");
        } else if (isLower) {
            System.out.println("The matrix is a lower triangular matrix.");
        } else {
            System.out.println("The matrix is neither upper nor lower triangular.");
        }
    }
}