

public class _1Memory {
    public static void main (String[] args)
    {
        String name = "Santhosh";
        // Data will not be duplicated
        // Only the Refernce is shared to the same data
        //String employee= "Santhosh";

        //System.out.println(name == employee);//Shallow Search- checks for the same address
        //                  9600 == 9600 -> It is better to compare the address than the data
        String tenant = new String("Santhosh");
        // new - creates a new String Variable

        
        System.out.println("Shallow Search: "+ (name== tenant) );

        //.equals -> allows us to do deep search for comparing
        System.out.println("Deep Search:    "+name.equals(tenant));//.equals() only checks for values

    }
}
