package recursion;
public class ReverseOfAStringUsingRecursion {
    public static void main(String[] args) {
        
        String str = "noisrucer";
        System.out.println("The reversed word is "+reverse(str,str.length()-1));
    }

    public static String reverse(String str,int i)
    {
        if (i ==0 )
        return String.valueOf(str.charAt(0));

        return str.charAt(i) +reverse(str, i-1);
        
    }

}
