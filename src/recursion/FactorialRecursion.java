package recursion;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int NumberToCheck = sc.nextInt();

        long factorial = calculateFactorial(NumberToCheck);
        System.out.println("Factorial of " + NumberToCheck + " is: " + factorial);

        sc.close(); // It's good practice to close the Scanner
    }

    // Recursive function to calculate factorial
    static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive step
        }
    }
}