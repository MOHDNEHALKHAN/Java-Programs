//Program to add two numbers and check if the first number is even or odd
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    input.close();
    }
}