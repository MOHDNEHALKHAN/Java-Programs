//Program to draw a single dimension array and print the values of the array
import java.util.Scanner;

public class Program20{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[4]; // way to declare an array

        for(int i = 0; i<4; i++)
        {
            a[i] = sc.nextInt();
        }
        //printing the value of array a
        for(int i = 0; i<4; i++)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
}