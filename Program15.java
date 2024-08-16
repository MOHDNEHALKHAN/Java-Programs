//Program to print all even numbers from 1 to N
import java.util.Scanner;

public class Program15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            
            }
        }

        scanner.close(); // Closing the scanner
    }
}