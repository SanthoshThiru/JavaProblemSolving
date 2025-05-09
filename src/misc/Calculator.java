package D5;

import java.util.Scanner;

public class Calculator {

    static int myadd(int n1, int n2) {
        return n1 + n2;
    }

    static int mysub(int n1, int n2) {
        return n1 - n2;
    }

    static int mymul(int n1, int n2) {
        return n1 * n2;
    }

    static int mydiv(int n1, int n2) {
        if (n2 == 0) {
            System.err.println("Error: Division by zero.");
            return 0;
        }
        return n1 / n2;
    }

    static void DisplayOptions() {
        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int action;

        do {
            DisplayOptions();
            System.out.print("Enter your Option: ");
            action = sc.nextInt();

            if (action >= 1 && action <= 4) {
                System.out.print("Enter First Number: ");
                int number1 = sc.nextInt();

                System.out.print("Enter Second Number: ");
                int number2 = sc.nextInt();

                switch (action) {
                    case 1:
                        System.out.println("Result: " + myadd(number1, number2));
                        break;
                    case 2:
                        System.out.println("Result: " + mysub(number1, number2));
                        break;
                    case 3:
                        System.out.println("Result: " + mymul(number1, number2));
                        break;
                    case 4:
                        System.out.println("Result: " + mydiv(number1, number2));
                        break;
                }
            } else if (action != 5) {
                System.err.println("Invalid Option. Try again.");
            }

        } while (action != 5);

        System.out.println("Exiting... Thank you!");
        sc.close();
    }
}
