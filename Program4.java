//Program to take two integer inputs from the user and perform arithmetic operations on them.
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide two integer arguments.");

        System.out.print("Enter the first integer: ");
        int v1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int v2 = scanner.nextInt();

        // Perform arithmetic operations
        int sum = v1 + v2;
        int difference = v1 - v2;

        System.out.println("sum: " + sum);
        System.out.println("difference: " + difference);

        scanner.close();
    }
}