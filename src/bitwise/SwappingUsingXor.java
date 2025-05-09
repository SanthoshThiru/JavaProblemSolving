public class SwappingUsingXor {

    public static void main(String[] args) {
        
        int a=8;
        int b=7;
        System.out.printf("\nBefore Swapping: a = %d AND b = %d\n",a,b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.printf("\nAfter Swapping: a = %d AND b = %d\n",a,b);
    }
}
