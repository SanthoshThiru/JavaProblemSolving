public class BitwiseChar {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hellos";
        
        String concat = s1+s2;

        char[] charr =concat.toCharArray();

        char  result=0;

        for(int i=0;i<charr.length;i++)
        {
            result =(char) (result ^ charr[i]);
        }

        System.out.println("Odd one out is "+result);
    }
}
