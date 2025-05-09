package recursion;
import java.util.Scanner;

public class PrintNumRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printNum(num);
        sc.close();
    }

    static void printNum(int num) {
        
        if(num ==0)
        return ;

        //System.out.printf("%d",printNum(num-1));
        //For 100 to 1(Descending)
        // System.out.println(num);
        // printNum(num-1);

        //For 1 to 100(Ascending)
        printNum(num-1);
        System.out.println(num);
        
    }
}
