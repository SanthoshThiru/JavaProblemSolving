package D5;

import java.util.Scanner;
import java.util.Arrays;

public class Switch {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int inputExpression = sc.nextInt();
        int[] Working_Day={1,2,3,4,5};
        int expression;

        // The 'in' operator is not directly supported for arrays in Java's if statement.
        // We need to use Arrays.binarySearch() or iterate through the array.
        // Using Arrays.binarySearch() requires the array to be sorted.

        Arrays.sort(Working_Day); // Sort the array for binarySearch

        if(Arrays.binarySearch(Working_Day, inputExpression) >= 0 )
        {
            expression = 1;
        }
        else{
            expression = 2;
        }

        switch(expression)
        {
            case 1:
                System.err.println("Working Day");
                break;
            case 2:
                System.out.println("Holiday");
                break;

            default:
                System.out.println("Enter the Correct expression");
                break;
        }
        sc.close(); // It's good practice to close the Scanner object
    }
}