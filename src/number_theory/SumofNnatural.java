package number_theory;
public class SumofNnatural {
    public static void main(String[] args) {
        int num = 5;
        //int sum = 0;
        int result=sumOfN(num);
        System.out.printf("The Sum of %d Natural Numbers is %d", num, result);
    }

    private static int sumOfN(int n) {
        if (n == 1)
            return 1;

        return n + sumOfN(n - 1);        
    }
}
