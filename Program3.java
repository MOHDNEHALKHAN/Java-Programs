//Program to take input from user and store it in an array and then print the array
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[4]; // way to declare array

        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i]);
        }
        
        sc.close(); // close the Scanner object
    }
}