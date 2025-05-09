public class DebugPractice {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        int sum = 0;
        int largest = numbers[0];
        String message = "The largest number is: ";

        System.out.println("Starting the process...");

        // Calculate the sum of the numbers
        for (int i = 0; i <= numbers.length; i++) { // Intentional error: index out of bounds
            sum = sum + numbers[i];
        }

        System.out.println("The sum of the numbers is: " + sum);

        // Find the largest number
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        // Create the final message
        String finalMessage = message + largest;

        System.out.println(finalMessage);

        String reversedString = reverseString("hello");
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String input) {
        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            reversed = input.charAt(i) + reversed; // Inefficient string concatenation
        }
        return reversed;
    }
}