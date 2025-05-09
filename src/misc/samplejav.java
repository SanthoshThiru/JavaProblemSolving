package D2;

import java.math.BigInteger;
import java.util.*;

public class samplejav{
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            BigInteger fact = BigInteger.ONE;
            for (int i=1;i<=num;i++){
                fact = fact.multiply(BigInteger.valueOf(i));

            }
            System.out.printf("The Factorial of %d is %d",num,fact);
        }
    }

    
}
