package BackTracking;

public class N_Queens_Optimized {
    public static void main(String[] args) {
        int n = 5;
        // if n<4, no solution

        int[] queens = new int[n];
        int row = 0;

        placeMyQueens(queens, row);

    }

    private static void placeMyQueens(int[] queens, int row) {
        if (row >= queens.length) {
            System.out.println("*****************************");
            for (int i = 0; i < queens.length; i++) {
                // printing rows and columns
                System.out.printf("[ %d,%d]\n", i, queens[i]);
            }
            return;
        }

        for (int col = 0; col < queens.length; col++) {
            if (isSafe(queens, row, col)) {
                queens[row] = col;// Placing our Que+en
                placeMyQueens(queens, row + 1);
            }
        }
    }

    private static boolean isSafe(int[] queens, int row, int col) {

        for (int i = 0; i < row; i++) {
            // Checking the same column
            if (queens[i] == col)
                return false;

            // Checking for Top Left to Bottom Right Diagonal
            if (i - row == queens[i] - col)
                return false;

            // Checking For Top Right to Bottom Left
            if (i - row == col - queens[i])
                return false;
        }
        return true;
    }
}
