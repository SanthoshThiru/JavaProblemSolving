package recursion;
public class SumOfArrayUsingRecursion {
    public static void main(String[] args) {
        
        int[] myarr={4,7,8,3,3};
        int i=myarr.length-1;
        System.out.printf("The Sum of Array is %d",myrec(myarr,i));

    }

    private static int myrec(int[] myarr,int i) {
        if(i==0)
        return myarr[0];

        return myarr[i] + myrec(myarr,i-1);


    }
}
