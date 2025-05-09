package BackTracking;

import java.util.Scanner;

public class N_Queens_Problem {

    public static void main(String[] args) {
        System.out.println("The N-Queen Problem");
        System.out.print("Enter the number of Queens to be placed: ");

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        System.out.println("Total Number of Squares is " + N * N);
        logic(N);
    }

    private static void logic(int n) {
        int[][] board = new int[n][n];

        if (!solveNQueens(board, 0)) {
            System.out.println("No solution exists.");
        }
    }

    static boolean solveNQueens(int[][] board, int row) {
        int n = board.length;

        if (row == n) {
            printBoard(board);
            //return true; // Return true to stop at first solution
            return false; // Uncomment to find all solutions
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                if (solveNQueens(board, row + 1)) {
                    return true;
                }
                board[row][col] = 0; // Backtrack
            }
        }

        return false;
    }

    static boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;

        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "Q " : ".");
            }
            System.out.println();
        }
        System.out.println("**************************************");
    }
}
