package matrix_operations;

import java.util.Scanner;

public class FloydPyramid {
    static void Space_Row(int s,int h)
    {
        int temp=(h-s)/2;
        for(int space=1;space<temp;space++){
            System.out.printf(" ");
            }
    }

    static void FloydN(int h)
    {
        int Natural_Number=1;
        for(int i=1;i<=h;i++)
        {   Space_Row(i,h);
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%d ",Natural_Number);
                Natural_Number++;
            }System.out.printf("\n");
            

        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the Height Of Your Floyd Triangle: ");
        int Height =sc.nextInt();

        FloydN(Height);

        sc.close();

    }

}