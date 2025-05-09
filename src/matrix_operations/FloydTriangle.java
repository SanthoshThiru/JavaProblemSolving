package matrix_operations;

import java.util.Scanner;

public class FloydTriangle {
    static void FloydN(int h)
    {
        int Natural_Number=1;
        for(int i=1;i<=h;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%d ",Natural_Number);
                Natural_Number++;
            }System.out.printf("\n");

        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Enter the Height Of Your Floyd Triangle: ");
            int Height =sc.nextInt();
            Height =8;
            FloydN(Height);
        }



    }

}
