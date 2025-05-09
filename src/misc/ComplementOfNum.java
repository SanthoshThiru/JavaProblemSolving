public class ComplementOfNum {
    public static void main(String[] args) {
        int number1 = 5;
        int result = ~number1;
        System.out.printf("The Complement of  %d is %d\n", number1, result);
        System.out.println("The Reversed Bit Form is "+Integer.reverse(number1));
        System.out.println(
                "The Complement of " + Integer.toBinaryString(number1) + " is " + Integer.toBinaryString(result));


        
    }

}
