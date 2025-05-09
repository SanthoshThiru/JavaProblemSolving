package D6;

public class ExceptionHandling {

    public static void main(String[] args) {
        int num1=14,num2=0;
        int div;
        
        try {
            div = num1 / num2;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Don't Divide By ZERO");
        }
        finally{
            System.out.println("I am inevitable(Finally Block)");
        }
    }

}
