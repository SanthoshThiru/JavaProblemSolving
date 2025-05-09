package number_theory;
//import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumsInRange {

    public static void main(String[] args) {
    
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please Enter the Range: ");
            int range=sc.nextInt();
            int Iterations=0;
            
            boolean[] prime = new boolean[range+1];
            //Arrays.fill(prime,true);
            prime[0]=false;
            prime[1]=false;
            for(int i=2;i<=range;i++)
            {
                prime[i]=true;
            }
            
            System.out.println("Prime Numbers Within the Range:");
            for(int num=2;num<=range;num++)
            {
                if(prime[num]==true)
                {
                    for(int j=2;j*num<=range;j++)
                    {
                        prime[num*j]=false;
                        Iterations++;
                    }
                    System.out.println(num);
                }
            }
            System.out.println("No. of Iterations is "+Iterations);
        }
    }
}