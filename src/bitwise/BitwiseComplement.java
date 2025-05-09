public class BitwiseComplement {
    public static void main(String[] args) {
        // Complement of a Number till a certain bits
        
        int num = 10;
        int temp = num;
        int output = 0;

        int bitsToComplement = 4;
        for (int i = 0; i < bitsToComplement; i++) {
            int last = num & 1;

            if (output != 0) {
                output = output << 1;
            }

            if (last == 1) {
                output = output | 1;
            }
            num = num >> 1;
        }
        System.out.println("Complement of " + temp + " is " + output);
    }
}
