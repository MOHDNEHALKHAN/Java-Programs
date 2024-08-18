//Program using arithmetic operators with user input
import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        z = x + y;
        System.out.println("Sum of x and y is: " + z);
        input.close();
    }
}
