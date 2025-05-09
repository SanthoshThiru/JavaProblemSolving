package D1;
import java.util.Scanner;

public class Main1 {
// Optimised Java Program To Check For Palindrome 
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please Enter The Number To Check: ");
            int num = sc.nextInt();
            //int temp=num;
            System.out.println("Original Number is "+num);
            int rev=0;
            int rem;
            if(num == 0)
            {
                System.out.println("Reversed Number is "+num);
            }
            else 
            {
            num=Math.abs(num);
            //temp=num;
            while(num>rev)
            {
                rem=num%10;
                rev=rev*10 + rem;
                num/=10;
            }
            if(num !=rev)
            {
                rev/=10;
            }

   }
   if(num == rev)
   {
            System.out.print("PALINDROME\n");;
   }
   else{
            System.out.print("Not a PALINDROME\n");
   }
        }
    }
    }