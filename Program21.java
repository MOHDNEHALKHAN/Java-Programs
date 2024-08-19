//Program to draw a 2D array and print the values of the array

import java.util.Scanner;

public class Program21{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of matrix");
        int n = sc.nextInt();
        int [][] m1 = new int[n][n]; // matrix 1
        int [][] m2 = new int[n][n]; // matrix 2
        int [][] mat = new int[n][n]; // resultant matrix

        System.out.println("Enter the values of matrix 1 row wise");
        for(int i = 0; i<n; i++) //row
        {
            for(int j = 0; j<n; j++) //column
            {
                m1[i][j] = sc.nextInt(); // entering the values of matrix 1
            }
        }
        System.out.println("Enter the values of matrix 2 row wise");
        for(int i = 0; i<n; i++) //row
        {
            for(int j = 0; j<n; j++) //column
            {
                m2[i][j] = sc.nextInt(); // entering the values of matrix 2
            }
        }

        System.out.println("Multiply the two matrices");
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++) 
            {
                for(int k = 0; k<n; k++)
                {
                    mat[i][j] += m1[i][k] * m2[k][j]; // formula to multiply the two matrices
                }
            }
        }
System.out.println("Resultant matrix is");
for(int i = 0; i<n; i++){
    for(int j = 0; j<n; j++)
    {
        System.out.print(mat[i][j] + " ");
    }
    System.out.println();
}
        sc.close();
    }
}