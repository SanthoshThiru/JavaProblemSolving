import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        // Using DFS (Depth First Search)

        String input = "abc";
        String ans="";
        ArrayList<String> result = new ArrayList<String>();
        permute(input,ans,result);
        System.out.println("The Permutation : "+ result);

    }

    private static void permute(String str,String perm,ArrayList<String>result)
    {
        if(str.length() ==0)
        {
            result.add(perm);
        }
        
        for(int i=0;i<str.length();i++)
        {
            String curr=""+ str.charAt(i);

            String remString = str.substring(0,i) + str.substring(i+1)  ;

            permute(remString,perm + curr,result);
        }
        
    }
}
