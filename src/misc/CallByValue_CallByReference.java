package D5;

public class CallByValue_CallByReference {
    static void Incr_Age(int age)
    {
        age++;
        System.out.println("Age 1: "+age);
    }
    public static void main(String[] args) {
        int age=24;
        Incr_Age(age);
        System.out.println("Age 2: "+age);

    }

}
