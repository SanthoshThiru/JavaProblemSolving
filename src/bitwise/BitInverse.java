public class BitInverse {
    public static void main(String[] args) {
        int input = 10;
        int complement = ~input;

        int mask =0;
        while(mask<input)
        {
            mask = (mask<<1) | 1;
        }
        complement =complement &mask;
        System.out.println("Complement of "+ input);
        System.out.println(complement);
    }
}
