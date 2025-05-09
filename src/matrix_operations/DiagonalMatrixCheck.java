package matrix_operations;

public class DiagonalMatrixCheck {
    public static void main(String[] args) {
        int ip[][] = {  { 3, 0, 0, 0, 0 },
                        { 0, 3, 0, 0, 0 },
                        { 0, 0, 1, 0, 0 },
                        { 0, 0, 0, 4, 0 },
                        { 0, 0, 0, 1, 0 } };

        if (DiagonalCheck(ip)== true) {
            System.out.println("The Given Matrix is A DIAGONAL MATRIX");
        }

        else {
            System.out.println("The Given Matrix is NOT A DIAGONAL MATRIX");

        }
    }

    private static boolean DiagonalCheck(int[][] ip) {
        if(ip.length == ip[0].length)
        {
            int flag1=0;
            int flag2=0;
            for(int i=0;i<ip.length;i++)
            {
                for(int j=0;j<ip[i].length;j++)
                {
                    if(i==j && ip[i][j]!=0 )
                    flag1=1;

                    else if(i!=j && ip[i][j]==0)
                    flag2=1;
                }
            }

            if(flag1==1 && flag2 ==1)
            return true;
        }
        return false;
    }
}
