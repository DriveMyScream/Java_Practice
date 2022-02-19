package Arrays;
import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the information for first matrix");
        System.out.print("Enter the number of rows: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c1 = sc.nextInt();
        int a [] [] = new int [r1] [c1];
        System.out.println("Enter the element in first matrix: ");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                System.out.print("Enter the element at index of " + i + ", " + j + " is: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Enter the information for Second matrix");
        System.out.print("Enter the number of rows: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c2 = sc.nextInt();
        int b [] [] = new int [r2] [c2];
        System.out.println("Enter the element in first matrix: ");
        for(int i=0; i<r2; i++) {
            for(int j=0; j<c2; j++) {
                System.out.print("Enter the element at index of " + i + ", " + j + " is: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        int r [] [] = new int [r1][c2];
        int sum = 0;

        for(int i=0; i<r1; i++) {
                for(int j=0; j<r1; j++) {
                    for(int k=0; k<c1; k++) {
                        sum = sum + a[i][k] * b[k][j];
                    }
                    r[i][j] = sum;
                    sum = 0;
                }
        }


        System.out.println("Printing the multiplication of matrix: ");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c2; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }


    }
}
