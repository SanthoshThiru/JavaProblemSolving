package number_theory;

import java.math.BigInteger;
import java.util.Scanner;

public class TrailZerosOfFactorial {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    
        //myFactorial();
        myTrailZeros(num);
        sc.close();
    }
    static void myFactorial(int num)
    {
        BigInteger fact = BigInteger.ONE;
        for (int i=1;i<=num;i++){
            fact = fact.multiply(BigInteger.valueOf(i));

        }
        System.out.printf("The Factorial of %d is %d",num,fact);
    
    }

    static void myTrailZeros(int num)
    {
        int nzeros=0;
        int iterations=0;

        for(int m=5;m<=num;m*=5)
        {
            nzeros+=num/m;
            iterations++;
        }
        System.out.println("\nFor Loop:");
        System.out.println("\nThe No. of Trailing Zeros is "+nzeros);
        System.out.println("\nThe No. of Iterations is "+iterations);

    }
    
}
