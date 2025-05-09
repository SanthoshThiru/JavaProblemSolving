package number_theory;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter Your Number:");
        int NumberToCheck=sc.nextInt();
        int result=1;
        for(int i=NumberToCheck;i>0;i--)
        {
            result*=i;
        }
        System.out.println("The Factorial of "+NumberToCheck+" is "+result);
    }

    }
    
}
