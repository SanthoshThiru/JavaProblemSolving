
public class PowerOfCheck {
    public static void main(String[] args) {

        int numToCheck = 31;
        int expression = numToCheck & (numToCheck - 1);
        // n & (n-1) == 0 
        // if and only if n is a Power of 2

        if (expression == 0)
            System.out.println("The Number " + numToCheck + " is a Power Of 2.");

        else
            System.out.println("The Number " + numToCheck + " is NOT Power Of 2.");
    }
}
