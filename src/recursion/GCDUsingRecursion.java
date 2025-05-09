package recursion;
public class GCDUsingRecursion {
    public static void main(String[] args) {
        System.out.println(HCF(12,18));
    }

    private static int HCF(int i, int j) {
        if(j!=0)
        {
        return HCF(j,i%j);
        }
        else
        {
        return i;
        }
    }
}
