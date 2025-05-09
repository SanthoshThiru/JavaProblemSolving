package D2;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int num1,num2;
        try (Scanner sc = new Scanner(System.in)) {
            num1=sc.nextInt();
            num2=sc.nextInt();
        }
        int res=0;
        for(int i=1;i<=num2;i++)
        {
            res+=num1;
        }
        System.out.println("The Multiplication of "+num1+" and "+num2);
        System.out.println(res);
    }
    
}
