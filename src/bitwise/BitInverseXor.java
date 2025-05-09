public class BitInverseXor {
    public static void main(String[] args) {
        int numberToflip = 10;
        int mask = 1;
        int result;
        int len = Integer.toBinaryString(numberToflip).length();
        mask <<= len;
        mask -= 1;
        result = mask ^ numberToflip;

        System.out.println("The Complement of " + numberToflip + " for " + len + "-bits is " + result);

    }
}
