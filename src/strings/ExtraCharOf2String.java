public class ExtraCharOf2String {
    public static void main(String[] args) {
        //String Approach
        String BaseString="world";
        String ToCompareString ="worlqd";
        System.out.println("The Anamoly Character Between two Strings is,");

        for(int i =0;i<BaseString.length();i++)
        {
            if((ToCompareString.charAt(i)) != (BaseString.charAt(i)))
            System.out.println(ToCompareString.charAt(i));
        }


    }
}