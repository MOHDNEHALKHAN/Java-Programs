import java.util.Scanner;

//Program to check if a number is Armstrong or not
public class Program14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        
        scanner.close(); // Close the scanner after use
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        return originalNumber == sum;
    }
}