public class ReverseStringDFS {
    public static void main(String[] args) {
        String str ="four";
        System.out.println(rev(str));
    }

    private static String rev(String s)
    {
        if(s.isEmpty())
        {
            return s;
        }

        return rev(s.substring(1)) + s.charAt(0);
        
    }

}
