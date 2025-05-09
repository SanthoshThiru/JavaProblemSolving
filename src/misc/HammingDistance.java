public class HammingDistance {
    public static void main(String[] args) {
        
        int Number1=11;
        int Number2=6;

        int NumtoHam = Number1 ^ Number2;

        int res=HammingDist(NumtoHam);
        System.out.printf("The Hamming Distance of %d and %d is %d",Number1,Number2,res);
    }

    static int HammingDist(int numtoHam) {
        int input = numtoHam;
        int mask = 1;
        int counter = 0;

        for (int i = 0; i < 32; i++) {
            if ((input & mask) != 0)
                counter++;

            mask = mask << 1;
        }
        return counter;

    }
}
