package D1;
import java.util.Scanner;
import java.lang.*;

public class Main {
   
// Optimised Java Program To Check For Palindrome 
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please Enter The Number To Check: ");
            int num = sc.nextInt();
            int temp=num;
            boolean pos=true;
            if(num<0)
            {
                pos= false;
            }
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
            temp=num;
            while(num>0)
            {
                rem=num%10;
                rev=rev*10 + rem;
                num/=10;
            }
            if(pos)
            System.out.println("Reversed Number is "+ rev);
            else
            System.out.println("Reversed Number is "+ rev*-1);

   }
   if(temp == rev)
   {
            System.out.print("PALINDROME\n");;
   }
   else{
            System.out.print("Not a PALINDROME\n");
   }
        }
    }
    }