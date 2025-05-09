package D5;

import java.util.Scanner;

public class IncreaseCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        int[] myarr = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < myarr.length; i++) {  // Read all 10 elements
            myarr[i] = sc.nextInt();
        }

        for (int j = 0; j < myarr.length - 1; j++) {
            if (myarr[j] > myarr[j + 1]) {
                flag = false;
                break;  // Exit early for efficiency
            }
        }

        if (flag)
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");

        sc.close();
    }
}
