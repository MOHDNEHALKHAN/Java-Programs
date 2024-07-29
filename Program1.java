//Program to add two numbers and check if the first number is even or odd
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int x, y, z;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the value of x: ");
            x = in.nextInt();

            System.out.print("Enter the value of y: ");
            y = in.nextInt();

            z = x + y;
            System.out.println("Value of z: " + z);

            if (x % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}