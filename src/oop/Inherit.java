package oop;

public class Inherit {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.id = 101;
        driver.name = "John Doe";
        driver.age = 30;
        driver.address = "123 Main St";
        driver.phno = "1234567890";
        driver.licenseNo = "DL123456";

        System.out.println("Driver Details:");
        System.out.println("ID: " + driver.id);
        System.out.println("Name: " + driver.name);
        System.out.println("Age: " + driver.age);
        System.out.println("Address: " + driver.address);
        System.out.println("Phone Number: " + driver.phno);
        System.out.println("License Number: " + driver.licenseNo);
    }
}

class WooberUser {
    int id;
    String name;
    int age;
    String address;
    String phno;
}

class Driver extends WooberUser {
    String licenseNo;
}
