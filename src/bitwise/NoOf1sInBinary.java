public class NoOf1sInBinary {
    public static void main(String[] args) {
        // This is a String-Based Approach(Not The Optimal One)
        int num = 17;
        int count = 0;
        String binNum = Integer.toBinaryString(num);
        char ValueToCheck = '1';
        for (int i = 0; i < binNum.length(); i++) {
            if (binNum.charAt(i) == ValueToCheck)
                count += 1;
        }
        System.out.println(binNum);
        System.out.println("The Number of 1s in Binary of " + num + " is " + count);
    }
}
