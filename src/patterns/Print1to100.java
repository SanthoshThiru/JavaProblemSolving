import java.util.Scanner;

public class Print1to100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int N = 1;
        System.out.println("Printing The Numbers From 1 to 100 (With LOOP)");
        for (int i = 0; i < num; i++) {
            System.out.println(i + 1);
        }

        System.out.println("Printing The Numbers From 1 to 100 (With RECURSION)");
        mymethod(num, N);
        sc.close();
    }

    static void mymethod(int n, int N) {
        if (n < 1)
            return;

        System.out.println(N);
        mymethod(n - 1, N + 1);
    }
}
