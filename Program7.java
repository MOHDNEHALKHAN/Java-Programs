//Program to demonstrate the use of constructor overloading in Java

public class Program7 {
    int a; // create a class attribute
    int rollNumber;
    String name;

    // create a class constructor for the Program class
    public Program7() {
        a = 100; // set the initial value of the class attribute a
    }

    // constructor with one parameter
    public Program7(int y) {
        a = y + 1;
    }

    // constructor with two parameters
    public Program7(int value, String name) {
        rollNumber = value;
        this.name = name;
    }

    public static void main(String[] args) {
        Program7 obj1 = new Program7(); // create an object of class Program (This will call the constructor)
        System.out.println(obj1.a); // print the value of a
        System.out.println("-------------");

        Program7 obj2 = new Program7(25);
        System.out.println(obj2.a); // print the value of a
        System.out.println("-------------");

        Program7 obj3 = new Program7(7, "Dishan");
        System.out.println("Rollnumber: " + obj3.rollNumber + " Name: " + obj3.name);
        System.out.println("-------------");
    }
}