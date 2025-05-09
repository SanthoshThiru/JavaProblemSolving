public class NoOf1sInBinaryUsingMask {
    public static void main(String[] args) {
        int input = 15;
        int mask = 1;
        int counter = 0;

        for (int i = 0; i < 32; i++) {
            if ((input & mask) != 0)
                counter++;

            mask = mask << 1;
        }

        System.out.println("Number of 1's in " + input + " i.e " + Integer.toBinaryString(input) + " is " + counter);
    }
}
