package number_theory;
public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        System.out.println("The Result is "+Fibo(n));
    }

    public static int Fibo(int n)
    {
        if(n==0 || n==1)
        return n;

        return Fibo(n-1)+ Fibo(n-2);
    }
}
